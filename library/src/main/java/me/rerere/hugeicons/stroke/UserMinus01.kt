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

val HugeIcons.UserMinus01: ImageVector
    get() {
        if (_userMinus01 != null) {
            return _userMinus01!!
        }
        _userMinus01 = ImageVector.Builder(
            name = "UserMinus01",
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
            moveTo(21f, 18.9999f)
            lineTo(15f, 18.9999f)
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
            moveTo(15f, 6.99988f)
            arcTo(4f, 4f, 0f, true, false, 7f, 6.99988f)
            arcTo(4f, 4f, 0f, true, false, 15f, 6.99988f)
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
            moveTo(3f, 21.0001f)
            curveTo(3.28417f, 17.3057f, 6.3f, 14.2192f, 10.0008f, 14.0378f)
            curveTo(10.3134f, 14.0225f, 10.6446f, 14.0096f, 11f, 13.9999f)
            lineTo(11.995f, 14.0662f)
            curveTo(13.0751f, 14.1382f, 14.0925f, 14.4366f, 15f, 14.9146f)
        }
        }.build()

        return _userMinus01!!
    }

private var _userMinus01: ImageVector? = null
