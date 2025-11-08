package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Fins: ImageVector
    get() {
        if (_fins != null) {
            return _fins!!
        }
        _fins = ImageVector.Builder(
            name = "Fins",
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
        moveTo(8.4711f, 19.9634f)
        curveTo(10.8851f, 15.8356f, 11.4912f, 7.3524f, 10.6271f, 3.69484f)
        lineTo(9f, 4.5f)
        curveTo(9f, 4.5f, 7.76992f, 3f, 6.49953f, 3f)
        curveTo(5.22914f, 3f, 4f, 4.5f, 4f, 4.5f)
        lineTo(2.3727f, 3.69484f)
        curveTo(1.5086f, 7.35252f, 2.11482f, 15.8358f, 4.52945f, 19.9634f)
        curveTo(5.33792f, 21.3455f, 7.66279f, 21.3456f, 8.4711f, 19.9634f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(15.5289f, 4.03657f)
        curveTo(13.1149f, 8.1644f, 12.5088f, 16.6476f, 13.3729f, 20.3052f)
        lineTo(15f, 19.5f)
        curveTo(15f, 19.5f, 16.2301f, 21f, 17.5005f, 21f)
        curveTo(18.7709f, 21f, 20f, 19.5f, 20f, 19.5f)
        lineTo(21.6273f, 20.3052f)
        curveTo(22.4914f, 16.6475f, 21.8852f, 8.16425f, 19.4706f, 4.03657f)
        curveTo(18.6621f, 2.65454f, 16.3372f, 2.6544f, 15.5289f, 4.03657f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(6.5f, 17f)
        verticalLineTo(16f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(17.5f, 8f)
        verticalLineTo(7f)
        }
        }.build()

        return _fins!!
    }

private var _fins: ImageVector? = null
