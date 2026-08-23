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

val HugeIcons.UserSwitch: ImageVector
    get() {
        if (_userSwitch != null) {
            return _userSwitch!!
        }
        _userSwitch = ImageVector.Builder(
            name = "UserSwitch",
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
            moveTo(11f, 13f)
            curveTo(10.6446f, 13.0097f, 10.3134f, 13.0226f, 10.0008f, 13.0379f)
            curveTo(6.3f, 13.2193f, 3.28417f, 16.3058f, 3f, 20.0002f)
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
            moveTo(15f, 6f)
            arcTo(4f, 4f, 0f, true, false, 7f, 6f)
            arcTo(4f, 4f, 0f, true, false, 15f, 6f)
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
            moveTo(17.5f, 20.5f)
            curveTo(15.2909f, 20.5f, 13.5f, 18.7091f, 13.5f, 16.5f)
            moveTo(17f, 13f)
            curveTo(19.2091f, 13f, 21f, 14.7909f, 21f, 17f)
            moveTo(17f, 14.5f)
            verticalLineTo(11.5f)
            lineTo(15.5f, 13f)
            lineTo(17f, 14.5f)
            close()
            moveTo(17.5f, 19f)
            verticalLineTo(22f)
            lineTo(19f, 20.5f)
            lineTo(17.5f, 19f)
            close()
        }
        }.build()

        return _userSwitch!!
    }

private var _userSwitch: ImageVector? = null
