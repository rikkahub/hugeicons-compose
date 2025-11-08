package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Man: ImageVector
    get() {
        if (_man != null) {
            return _man!!
        }
        _man = ImageVector.Builder(
            name = "Man",
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
        moveTo(14f, 4f)
        curveTo(14f, 5.10457f, 13.1046f, 6f, 12f, 6f)
        curveTo(10.8954f, 6f, 10f, 5.10457f, 10f, 4f)
        curveTo(10f, 2.89543f, 10.8954f, 2f, 12f, 2f)
        curveTo(13.1046f, 2f, 14f, 2.89543f, 14f, 4f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(16f, 12.5f)
        curveTo(16f, 10.6144f, 16f, 9.67157f, 15.4142f, 9.08579f)
        curveTo(14.8284f, 8.5f, 13.8856f, 8.5f, 12f, 8.5f)
        curveTo(10.1144f, 8.5f, 9.17157f, 8.5f, 8.58579f, 9.08579f)
        curveTo(8f, 9.67157f, 8f, 10.6144f, 8f, 12.5f)
        verticalLineTo(14f)
        curveTo(8f, 14.9428f, 8f, 15.4142f, 8.29289f, 15.7071f)
        curveTo(8.58579f, 16f, 9.05719f, 16f, 10f, 16f)
        verticalLineTo(20f)
        curveTo(10f, 20.9428f, 10f, 21.4142f, 10.2929f, 21.7071f)
        curveTo(10.5858f, 22f, 11.0572f, 22f, 12f, 22f)
        curveTo(12.9428f, 22f, 13.4142f, 22f, 13.7071f, 21.7071f)
        curveTo(14f, 21.4142f, 14f, 20.9428f, 14f, 20f)
        verticalLineTo(16f)
        curveTo(14.9428f, 16f, 15.4142f, 16f, 15.7071f, 15.7071f)
        curveTo(16f, 15.4142f, 16f, 14.9428f, 16f, 14f)
        verticalLineTo(12.5f)
        }
        }.build()

        return _man!!
    }

private var _man: ImageVector? = null
