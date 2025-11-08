package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.CommentRemove03: ImageVector
    get() {
        if (_commentRemove03 != null) {
            return _commentRemove03!!
        }
        _commentRemove03 = ImageVector.Builder(
            name = "CommentRemove03",
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
        moveTo(2f, 10.5f)
        curveTo(2f, 5.5f, 6f, 3f, 12f, 3f)
        curveTo(18f, 3f, 22f, 5.5f, 22f, 10.5f)
        curveTo(22f, 15.5f, 18f, 18f, 12f, 18f)
        verticalLineTo(21f)
        curveTo(12f, 21f, 2f, 18f, 2f, 10.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(9f, 7.5f)
        lineTo(12f, 10.5f)
        moveTo(12f, 10.5f)
        lineTo(15f, 13.5f)
        moveTo(12f, 10.5f)
        lineTo(15f, 7.5f)
        moveTo(12f, 10.5f)
        lineTo(9f, 13.5f)
        }
        }.build()

        return _commentRemove03!!
    }

private var _commentRemove03: ImageVector? = null
