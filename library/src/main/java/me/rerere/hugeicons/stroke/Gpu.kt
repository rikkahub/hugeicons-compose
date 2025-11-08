package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Gpu: ImageVector
    get() {
        if (_gpu != null) {
            return _gpu!!
        }
        _gpu = ImageVector.Builder(
            name = "Gpu",
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
        moveTo(4f, 21f)
        verticalLineTo(5f)
        curveTo(4f, 4.53501f, 4f, 4.30252f, 3.94889f, 4.11177f)
        curveTo(3.81019f, 3.59413f, 3.40587f, 3.18981f, 2.88823f, 3.05111f)
        curveTo(2.69748f, 3f, 2.46499f, 3f, 2f, 3f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(4f, 5f)
        horizontalLineTo(17f)
        curveTo(19.357f, 5f, 20.5355f, 5f, 21.2678f, 5.73223f)
        curveTo(22f, 6.46447f, 22f, 7.64298f, 22f, 10f)
        verticalLineTo(14.5f)
        curveTo(22f, 16.857f, 22f, 18.0355f, 21.2678f, 18.7678f)
        curveTo(20.5355f, 19.5f, 19.357f, 19.5f, 17f, 19.5f)
        horizontalLineTo(12.118f)
        curveTo(11.4328f, 19.5f, 10.8064f, 19.1129f, 10.5f, 18.5f)
        curveTo(10.1936f, 17.8871f, 9.56717f, 17.5f, 8.88197f, 17.5f)
        horizontalLineTo(4f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(19f, 11.5f)
        curveTo(19f, 13.1568f, 17.6569f, 14.5f, 16f, 14.5f)
        curveTo(14.3431f, 14.5f, 13f, 13.1568f, 13f, 11.5f)
        curveTo(13f, 9.84314f, 14.3431f, 8.5f, 16f, 8.5f)
        curveTo(17.6569f, 8.5f, 19f, 9.84314f, 19f, 11.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(7.5f, 8.5f)
        horizontalLineTo(9.5f)
        moveTo(7.5f, 11.5f)
        horizontalLineTo(9.5f)
        moveTo(7.5f, 14.5f)
        horizontalLineTo(9.5f)
        }
        }.build()

        return _gpu!!
    }

private var _gpu: ImageVector? = null
