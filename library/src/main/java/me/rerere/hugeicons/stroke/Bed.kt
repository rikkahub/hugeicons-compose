package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Bed: ImageVector
    get() {
        if (_bed != null) {
            return _bed!!
        }
        _bed = ImageVector.Builder(
            name = "Bed",
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
        moveTo(2f, 3.5f)
        verticalLineTo(20.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(22f, 8.5f)
        lineTo(22f, 20.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(2f, 8.5f)
        lineTo(6f, 10.5f)
        horizontalLineTo(22f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(2f, 15.5f)
        horizontalLineTo(6f)
        moveTo(22f, 15.5f)
        horizontalLineTo(19f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(6f, 10.5f)
        verticalLineTo(16.5f)
        curveTo(6f, 18.1547f, 6.34533f, 18.5f, 8f, 18.5f)
        horizontalLineTo(17f)
        curveTo(18.6547f, 18.5f, 19f, 18.1547f, 19f, 16.5f)
        verticalLineTo(10.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(6.81362f, 10.5f)
        curveTo(6.89385f, 10.076f, 7.0202f, 9.63248f, 6.99567f, 9.19713f)
        curveTo(6.95941f, 8.5536f, 6.63697f, 7.96625f, 6.1264f, 7.61368f)
        curveTo(5.92478f, 7.47446f, 5.48f, 7.33239f, 5.01268f, 7.21093f)
        curveTo(4.3308f, 7.0337f, 3.98986f, 6.94508f, 3.59142f, 7.03644f)
        curveTo(3.30841f, 7.10133f, 3.06258f, 7.25187f, 2.71115f, 7.52079f)
        curveTo(2.67243f, 7.55042f, 2.65307f, 7.56523f, 2.62289f, 7.59026f)
        curveTo(2.3843f, 7.78812f, 2.17276f, 8.07424f, 2.05352f, 8.36034f)
        curveTo(2.03844f, 8.39653f, 2.02562f, 8.43102f, 2f, 8.5f)
        verticalLineTo(8.5f)
        }
        }.build()

        return _bed!!
    }

private var _bed: ImageVector? = null
