package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Teacher: ImageVector
    get() {
        if (_teacher != null) {
            return _teacher!!
        }
        _teacher = ImageVector.Builder(
            name = "Teacher",
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
        moveTo(2f, 2f)
        horizontalLineTo(16f)
        curveTo(17.8856f, 2f, 18.8284f, 2f, 19.4142f, 2.58579f)
        curveTo(20f, 3.17157f, 20f, 4.11438f, 20f, 6f)
        verticalLineTo(12f)
        curveTo(20f, 13.8856f, 20f, 14.8284f, 19.4142f, 15.4142f)
        curveTo(18.8284f, 16f, 17.8856f, 16f, 16f, 16f)
        horizontalLineTo(9f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(10f, 6.5f)
        horizontalLineTo(16f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(2f, 17f)
        verticalLineTo(13f)
        curveTo(2f, 12.0572f, 2f, 11.5858f, 2.29289f, 11.2929f)
        curveTo(2.58579f, 11f, 3.05719f, 11f, 4f, 11f)
        horizontalLineTo(6f)
        moveTo(2f, 17f)
        horizontalLineTo(6f)
        moveTo(2f, 17f)
        verticalLineTo(22f)
        moveTo(6f, 17f)
        verticalLineTo(11f)
        moveTo(6f, 17f)
        verticalLineTo(22f)
        moveTo(6f, 11f)
        horizontalLineTo(9f)
        horizontalLineTo(12f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(6f, 6.5f)
        curveTo(6f, 7.60457f, 5.10457f, 8.5f, 4f, 8.5f)
        curveTo(2.89543f, 8.5f, 2f, 7.60457f, 2f, 6.5f)
        curveTo(2f, 5.39543f, 2.89543f, 4.5f, 4f, 4.5f)
        curveTo(5.10457f, 4.5f, 6f, 5.39543f, 6f, 6.5f)
        }
        }.build()

        return _teacher!!
    }

private var _teacher: ImageVector? = null
