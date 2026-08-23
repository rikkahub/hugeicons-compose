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

val HugeIcons.UserTime01: ImageVector
    get() {
        if (_userTime01 != null) {
            return _userTime01!!
        }
        _userTime01 = ImageVector.Builder(
            name = "UserTime01",
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
            moveTo(14.5f, 6f)
            arcTo(4f, 4f, 0f, true, false, 6.5f, 6f)
            arcTo(4f, 4f, 0f, true, false, 14.5f, 6f)
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
            moveTo(10.5f, 13f)
            curveTo(10.1446f, 13.0097f, 9.81335f, 13.0226f, 9.50082f, 13.0379f)
            curveTo(5.8f, 13.2193f, 2.78417f, 16.3058f, 2.5f, 20.0002f)
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
            moveTo(18.5f, 18f)
            lineTo(17f, 17.5f)
            verticalLineTo(15.5f)
            moveTo(21.5f, 17.5f)
            curveTo(21.5f, 19.9853f, 19.4853f, 22f, 17f, 22f)
            curveTo(14.5147f, 22f, 12.5f, 19.9853f, 12.5f, 17.5f)
            curveTo(12.5f, 15.0147f, 14.5147f, 13f, 17f, 13f)
            curveTo(19.4853f, 13f, 21.5f, 15.0147f, 21.5f, 17.5f)
            close()
        }
        }.build()

        return _userTime01!!
    }

private var _userTime01: ImageVector? = null
