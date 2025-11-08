package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Microwave: ImageVector
    get() {
        if (_microwave != null) {
            return _microwave!!
        }
        _microwave = ImageVector.Builder(
            name = "Microwave",
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
        moveTo(2f, 15f)
        verticalLineTo(7f)
        curveTo(2f, 5.11438f, 2f, 4.17157f, 2.58579f, 3.58579f)
        curveTo(3.17157f, 3f, 4.11438f, 3f, 6f, 3f)
        horizontalLineTo(18f)
        curveTo(19.8856f, 3f, 20.8284f, 3f, 21.4142f, 3.58579f)
        curveTo(22f, 4.17157f, 22f, 5.11438f, 22f, 7f)
        verticalLineTo(15f)
        curveTo(22f, 16.8856f, 22f, 17.8284f, 21.4142f, 18.4142f)
        curveTo(20.8284f, 19f, 19.8856f, 19f, 18f, 19f)
        horizontalLineTo(6f)
        curveTo(4.11438f, 19f, 3.17157f, 19f, 2.58579f, 18.4142f)
        curveTo(2f, 17.8284f, 2f, 16.8856f, 2f, 15f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(19f, 6.00895f)
        verticalLineTo(6f)
        moveTo(19f, 9.00447f)
        verticalLineTo(8.99553f)
        moveTo(19f, 12f)
        verticalLineTo(11.9911f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(5f, 14f)
        verticalLineTo(8f)
        curveTo(5f, 7.05719f, 5f, 6.58579f, 5.29289f, 6.29289f)
        curveTo(5.58579f, 6f, 6.05719f, 6f, 7f, 6f)
        horizontalLineTo(14f)
        curveTo(14.9428f, 6f, 15.4142f, 6f, 15.7071f, 6.29289f)
        curveTo(16f, 6.58579f, 16f, 7.05719f, 16f, 8f)
        verticalLineTo(14f)
        curveTo(16f, 14.9428f, 16f, 15.4142f, 15.7071f, 15.7071f)
        curveTo(15.4142f, 16f, 14.9428f, 16f, 14f, 16f)
        horizontalLineTo(7f)
        curveTo(6.05719f, 16f, 5.58579f, 16f, 5.29289f, 15.7071f)
        curveTo(5f, 15.4142f, 5f, 14.9428f, 5f, 14f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(5f, 19f)
        verticalLineTo(21f)
        moveTo(19f, 19f)
        verticalLineTo(21f)
        }
        }.build()

        return _microwave!!
    }

private var _microwave: ImageVector? = null
