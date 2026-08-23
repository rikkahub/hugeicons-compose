package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.ClockAlert: ImageVector
    get() {
        if (_clockAlert != null) {
            return _clockAlert!!
        }
        _clockAlert = ImageVector.Builder(
            name = "ClockAlert",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
        path(
            fill = null,
            stroke = SolidColor(Color(0xFF141B34)),
            fillAlpha = 1f,
            strokeAlpha = 1f,
            strokeLineWidth = 1.5f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(21.9f, 10f)
            curveTo(20.9734f, 5.43552f, 16.9379f, 2f, 12.1f, 2f)
            curveTo(6.57717f, 2f, 2.10002f, 6.47715f, 2.10002f, 12f)
            curveTo(2.10002f, 17.5228f, 6.57717f, 22f, 12.1f, 22f)
            curveTo(13.1452f, 22f, 14.153f, 21.8396f, 15.1f, 21.5422f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF141B34)),
            fillAlpha = 1f,
            strokeAlpha = 1f,
            strokeLineWidth = 1.5f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(12.1f, 8f)
            verticalLineTo(12f)
            lineTo(14.1f, 14f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF141B34)),
            fillAlpha = 1f,
            strokeAlpha = 1f,
            strokeLineWidth = 1.5f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(20.1f, 18f)
            verticalLineTo(14f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF141B34)),
            fillAlpha = 1f,
            strokeAlpha = 1f,
            strokeLineWidth = 1.5f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(20.225f, 21.75f)
            horizontalLineTo(20.1f)
            moveTo(20.35f, 21.75f)
            curveTo(20.35f, 21.8881f, 20.2381f, 22f, 20.1f, 22f)
            curveTo(19.962f, 22f, 19.85f, 21.8881f, 19.85f, 21.75f)
            curveTo(19.85f, 21.6119f, 19.962f, 21.5f, 20.1f, 21.5f)
            curveTo(20.2381f, 21.5f, 20.35f, 21.6119f, 20.35f, 21.75f)
            close()
        }
        }.build()

        return _clockAlert!!
    }

private var _clockAlert: ImageVector? = null
