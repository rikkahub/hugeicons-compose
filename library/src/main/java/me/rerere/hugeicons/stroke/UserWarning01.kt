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

val HugeIcons.UserWarning01: ImageVector
    get() {
        if (_userWarning01 != null) {
            return _userWarning01!!
        }
        _userWarning01 = ImageVector.Builder(
            name = "UserWarning01",
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
            moveTo(20f, 21.0002f)
            curveTo(19.713f, 17.2691f, 16.7289f, 14.3153f, 12.995f, 14.0663f)
            lineTo(12f, 14f)
            curveTo(11.6446f, 14.0097f, 11.3133f, 14.0226f, 11.0008f, 14.0379f)
            curveTo(7.29998f, 14.2193f, 4.28416f, 17.3058f, 3.99998f, 21.0002f)
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
            moveTo(16f, 7f)
            arcTo(4f, 4f, 0f, true, false, 8f, 7f)
            arcTo(4f, 4f, 0f, true, false, 16f, 7f)
            close()
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
            moveTo(20f, 6f)
            verticalLineTo(10f)
            moveTo(20f, 13f)
            verticalLineTo(13.01f)
        }
        }.build()

        return _userWarning01!!
    }

private var _userWarning01: ImageVector? = null
