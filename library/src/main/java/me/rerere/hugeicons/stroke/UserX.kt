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

val HugeIcons.UserX: ImageVector
    get() {
        if (_userX != null) {
            return _userX!!
        }
        _userX = ImageVector.Builder(
            name = "UserX",
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
            moveTo(15.5f, 21f)
            lineTo(18.5f, 18f)
            moveTo(18.5f, 18f)
            lineTo(21.5f, 15f)
            moveTo(18.5f, 18f)
            lineTo(15.5f, 15f)
            moveTo(18.5f, 18f)
            lineTo(21.5f, 21f)
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
            moveTo(2.5f, 19f)
            verticalLineTo(16.9704f)
            curveTo(2.5f, 15.7281f, 3.05927f, 14.5099f, 4.18968f, 13.9946f)
            curveTo(5.5685f, 13.3661f, 7.22212f, 13f, 9f, 13f)
            curveTo(10.4418f, 13f, 11.8019f, 13.2407f, 13f, 13.667f)
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
            moveTo(12.5f, 6.5f)
            arcTo(3.5f, 3.5f, 0f, true, false, 5.5f, 6.5f)
            arcTo(3.5f, 3.5f, 0f, true, false, 12.5f, 6.5f)
            close()
        }
        }.build()

        return _userX!!
    }

private var _userX: ImageVector? = null
