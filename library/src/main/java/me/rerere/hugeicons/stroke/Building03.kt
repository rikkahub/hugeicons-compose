package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Building03: ImageVector
    get() {
        if (_building03 != null) {
            return _building03!!
        }
        _building03 = ImageVector.Builder(
            name = "Building03",
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
        moveTo(16f, 10f)
        lineTo(18.1494f, 10.6448f)
        curveTo(19.5226f, 11.0568f, 20.2092f, 11.2628f, 20.6046f, 11.7942f)
        curveTo(21f, 12.3256f, 21f, 13.0425f, 21f, 14.4761f)
        verticalLineTo(22f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(8f, 9f)
        lineTo(11f, 9f)
        moveTo(8f, 13f)
        lineTo(11f, 13f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12f, 22f)
        verticalLineTo(19f)
        curveTo(12f, 18.0572f, 12f, 17.5858f, 11.7071f, 17.2929f)
        curveTo(11.4142f, 17f, 10.9428f, 17f, 10f, 17f)
        horizontalLineTo(9f)
        curveTo(8.05719f, 17f, 7.58579f, 17f, 7.29289f, 17.2929f)
        curveTo(7f, 17.5858f, 7f, 18.0572f, 7f, 19f)
        verticalLineTo(22f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(2f, 22f)
        lineTo(22f, 22f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(3f, 22f)
        verticalLineTo(6.71724f)
        curveTo(3f, 4.20649f, 3f, 2.95111f, 3.79118f, 2.32824f)
        curveTo(4.58237f, 1.70537f, 5.74742f, 2.04355f, 8.07752f, 2.7199f)
        lineTo(13.0775f, 4.17122f)
        curveTo(14.4836f, 4.57937f, 15.1867f, 4.78344f, 15.5933f, 5.33965f)
        curveTo(16f, 5.89587f, 16f, 6.65344f, 16f, 8.16857f)
        verticalLineTo(22f)
        }
        }.build()

        return _building03!!
    }

private var _building03: ImageVector? = null
