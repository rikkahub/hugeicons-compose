package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Truck: ImageVector
    get() {
        if (_truck != null) {
            return _truck!!
        }
        _truck = ImageVector.Builder(
            name = "Truck",
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
        moveTo(11f, 17f)
        horizontalLineTo(15f)
        moveTo(13.5f, 7f)
        horizontalLineTo(14.4429f)
        curveTo(15.7533f, 7f, 16.4086f, 7f, 16.9641f, 7.31452f)
        curveTo(17.5196f, 7.62904f, 17.89f, 8.20972f, 18.6308f, 9.37107f)
        curveTo(19.1502f, 10.1854f, 19.6955f, 10.7765f, 20.4622f, 11.3024f)
        curveTo(21.2341f, 11.8318f, 21.6012f, 12.0906f, 21.8049f, 12.506f)
        curveTo(22f, 12.9038f, 22f, 13.375f, 22f, 14.3173f)
        curveTo(22f, 15.5596f, 22f, 16.1808f, 21.651f, 16.5755f)
        curveTo(21.636f, 16.5925f, 21.6207f, 16.609f, 21.6049f, 16.625f)
        curveTo(21.2375f, 17f, 20.6594f, 17f, 19.503f, 17f)
        horizontalLineTo(19f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(13f, 7f)
        lineTo(13.9942f, 9.48556f)
        curveTo(14.4813f, 10.7034f, 14.7249f, 11.3123f, 15.2328f, 11.6561f)
        curveTo(15.7407f, 12f, 16.3965f, 12f, 17.7081f, 12f)
        horizontalLineTo(21f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(4.86957f, 17f)
        curveTo(3.51684f, 17f, 2.84048f, 17f, 2.42024f, 16.5607f)
        curveTo(2f, 16.1213f, 2f, 15.4142f, 2f, 14f)
        verticalLineTo(7f)
        curveTo(2f, 5.58579f, 2f, 4.87868f, 2.42024f, 4.43934f)
        curveTo(2.84048f, 4f, 3.51684f, 4f, 4.86957f, 4f)
        horizontalLineTo(10.1304f)
        curveTo(11.4832f, 4f, 12.1595f, 4f, 12.5798f, 4.43934f)
        curveTo(13f, 4.87868f, 13f, 5.58579f, 13f, 7f)
        verticalLineTo(17f)
        horizontalLineTo(8.69565f)
        }
        }.build()

        return _truck!!
    }

private var _truck: ImageVector? = null
