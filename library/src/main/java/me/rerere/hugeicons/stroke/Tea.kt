package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Tea: ImageVector
    get() {
        if (_tea != null) {
            return _tea!!
        }
        _tea = ImageVector.Builder(
            name = "Tea",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(18.2505f, 10.5f)
        horizontalLineTo(19.6403f)
        curveTo(21.4918f, 10.5f, 22.0421f, 10.7655f, 21.9975f, 12.0838f)
        curveTo(21.9237f, 14.2674f, 20.939f, 16.8047f, 17f, 17.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(5.94627f, 20.6145f)
        curveTo(2.57185f, 18.02f, 2.07468f, 14.3401f, 2.00143f, 10.5001f)
        curveTo(1.96979f, 8.8413f, 2.45126f, 8.5f, 4.65919f, 8.5f)
        horizontalLineTo(15.3408f)
        curveTo(17.5487f, 8.5f, 18.0302f, 8.8413f, 17.9986f, 10.5001f)
        curveTo(17.9253f, 14.3401f, 17.4281f, 18.02f, 14.0537f, 20.6145f)
        curveTo(13.0934f, 21.3528f, 12.2831f, 21.5f, 10.9194f, 21.5f)
        horizontalLineTo(9.08064f)
        curveTo(7.71686f, 21.5f, 6.90658f, 21.3528f, 5.94627f, 20.6145f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(10f, 8.5f)
        verticalLineTo(13.5f)
        moveTo(8.50424f, 16.2966f)
        lineTo(8.79616f, 14.4451f)
        curveTo(8.88166f, 13.9028f, 9.39425f, 13.5f, 9.99884f, 13.5f)
        curveTo(10.6034f, 13.5f, 11.116f, 13.9028f, 11.2015f, 14.4451f)
        lineTo(11.4934f, 16.2966f)
        curveTo(11.6508f, 17.2944f, 8.36613f, 17.1726f, 8.50424f, 16.2966f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(11.3089f, 2.5f)
        curveTo(10.7622f, 2.83861f, 10.0012f, 4f, 10.0012f, 5.5f)
        moveTo(7.53971f, 4f)
        curveTo(7.53971f, 4f, 7f, 4.5f, 7f, 5.5f)
        moveTo(14.0012f, 4f)
        curveTo(13.7279f, 4.1693f, 13.5f, 5f, 13.5f, 5.5f)
        }
        }.build()

        return _tea!!
    }

private var _tea: ImageVector? = null
