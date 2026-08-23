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

val HugeIcons.UserRemove01: ImageVector
    get() {
        if (_userRemove01 != null) {
            return _userRemove01!!
        }
        _userRemove01 = ImageVector.Builder(
            name = "UserRemove01",
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
            moveTo(12.495f, 14.0662f)
            lineTo(11.5f, 13.9999f)
            curveTo(11.1446f, 14.0096f, 10.8134f, 14.0225f, 10.5008f, 14.0378f)
            curveTo(6.8f, 14.2192f, 3.78417f, 17.3057f, 3.5f, 21.0001f)
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
            moveTo(20.5f, 15.9999f)
            lineTo(18f, 18.4999f)
            moveTo(18f, 18.4999f)
            lineTo(15.5f, 20.9999f)
            moveTo(18f, 18.4999f)
            lineTo(20.5f, 20.9999f)
            moveTo(18f, 18.4999f)
            lineTo(15.5f, 15.9999f)
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
            moveTo(15.5f, 6.99988f)
            arcTo(4f, 4f, 0f, true, false, 7.5f, 6.99988f)
            arcTo(4f, 4f, 0f, true, false, 15.5f, 6.99988f)
            close()
        }
        }.build()

        return _userRemove01!!
    }

private var _userRemove01: ImageVector? = null
