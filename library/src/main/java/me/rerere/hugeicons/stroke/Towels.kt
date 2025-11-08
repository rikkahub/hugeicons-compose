package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Towels: ImageVector
    get() {
        if (_towels != null) {
            return _towels!!
        }
        _towels = ImageVector.Builder(
            name = "Towels",
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
        moveTo(6.5f, 5f)
        lineTo(15f, 5f)
        curveTo(16.8856f, 5f, 17.8284f, 5f, 18.4142f, 5.58579f)
        curveTo(19f, 6.17157f, 19f, 7.11438f, 19f, 9f)
        verticalLineTo(12f)
        curveTo(19f, 13.8856f, 19f, 14.8284f, 18.4142f, 15.4142f)
        curveTo(17.8284f, 16f, 16.8856f, 16f, 15f, 16f)
        horizontalLineTo(12f)
        curveTo(10.1144f, 16f, 9.17157f, 16f, 8.58579f, 15.4142f)
        curveTo(8f, 14.8284f, 8f, 13.8856f, 8f, 12f)
        lineTo(8f, 8f)
        moveTo(6.5f, 5f)
        curveTo(5.67157f, 5f, 5f, 5.67157f, 5f, 6.5f)
        verticalLineTo(8f)
        horizontalLineTo(8f)
        moveTo(6.5f, 5f)
        curveTo(7.32843f, 5f, 8f, 5.67157f, 8f, 6.5f)
        verticalLineTo(8f)
        moveTo(17f, 16f)
        curveTo(17f, 17.8856f, 17f, 18.8284f, 16.4142f, 19.4142f)
        curveTo(15.8284f, 20f, 14.8856f, 20f, 13f, 20f)
        horizontalLineTo(9f)
        curveTo(7.11438f, 20f, 6.17157f, 20f, 5.58579f, 19.4142f)
        curveTo(5f, 18.8284f, 5f, 17.8856f, 5f, 16f)
        lineTo(5f, 11f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(22f, 4f)
        verticalLineTo(5f)
        curveTo(22f, 5.93188f, 22f, 6.39782f, 21.8478f, 6.76537f)
        curveTo(21.6448f, 7.25542f, 21.2554f, 7.64477f, 20.7654f, 7.84776f)
        curveTo(20.3978f, 8f, 19.9319f, 8f, 19f, 8f)
        moveTo(2f, 4f)
        verticalLineTo(5f)
        curveTo(2f, 5.93188f, 2f, 6.39782f, 2.15224f, 6.76537f)
        curveTo(2.35523f, 7.25542f, 2.74458f, 7.64477f, 3.23463f, 7.84776f)
        curveTo(3.60218f, 8f, 4.06812f, 8f, 5f, 8f)
        }
        }.build()

        return _towels!!
    }

private var _towels: ImageVector? = null
