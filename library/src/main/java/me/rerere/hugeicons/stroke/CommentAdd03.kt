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

val HugeIcons.CommentAdd03: ImageVector
    get() {
        if (_commentAdd03 != null) {
            return _commentAdd03!!
        }
        _commentAdd03 = ImageVector.Builder(
            name = "CommentAdd03",
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
            moveTo(2f, 10.5f)
            curveTo(2f, 5.5f, 6f, 3f, 12f, 3f)
            curveTo(18f, 3f, 22f, 5.5f, 22f, 10.5f)
            curveTo(22f, 15.5f, 18f, 18f, 12f, 18f)
            verticalLineTo(21f)
            curveTo(12f, 21f, 2f, 18f, 2f, 10.5f)
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
            moveTo(8.5f, 10.5f)
            horizontalLineTo(15.5f)
            moveTo(12f, 7f)
            lineTo(12f, 14f)
        }
        }.build()

        return _commentAdd03!!
    }

private var _commentAdd03: ImageVector? = null
