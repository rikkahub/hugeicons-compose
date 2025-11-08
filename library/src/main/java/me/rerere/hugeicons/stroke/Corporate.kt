package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Corporate: ImageVector
    get() {
        if (_corporate != null) {
            return _corporate!!
        }
        _corporate = ImageVector.Builder(
            name = "Corporate",
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
        moveTo(12f, 22f)
        verticalLineTo(6f)
        curveTo(12f, 4.11438f, 12f, 3.17157f, 11.4142f, 2.58579f)
        curveTo(10.8284f, 2f, 9.88562f, 2f, 8f, 2f)
        horizontalLineTo(6f)
        curveTo(4.11438f, 2f, 3.17157f, 2f, 2.58579f, 2.58579f)
        curveTo(2f, 3.17157f, 2f, 4.11438f, 2f, 6f)
        verticalLineTo(18f)
        curveTo(2f, 19.8856f, 2f, 20.8284f, 2.58579f, 21.4142f)
        curveTo(3.17157f, 22f, 4.11438f, 22f, 6f, 22f)
        horizontalLineTo(12f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12f, 22f)
        horizontalLineTo(18f)
        curveTo(19.8856f, 22f, 20.8284f, 22f, 21.4142f, 21.4142f)
        curveTo(22f, 20.8284f, 22f, 19.8856f, 22f, 18f)
        verticalLineTo(12f)
        curveTo(22f, 10.1144f, 22f, 9.17157f, 21.4142f, 8.58579f)
        curveTo(20.8284f, 8f, 19.8856f, 8f, 18f, 8f)
        horizontalLineTo(12f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(18.5f, 16f)
        horizontalLineTo(15.5f)
        moveTo(18.5f, 12f)
        lineTo(15.5f, 12f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(8.5f, 14f)
        horizontalLineTo(5.5f)
        moveTo(8.5f, 10f)
        horizontalLineTo(5.5f)
        moveTo(8.5f, 6f)
        horizontalLineTo(5.5f)
        }
        }.build()

        return _corporate!!
    }

private var _corporate: ImageVector? = null
