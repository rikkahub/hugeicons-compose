package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.CommentBlock03: ImageVector
    get() {
        if (_commentBlock03 != null) {
            return _commentBlock03!!
        }
        _commentBlock03 = ImageVector.Builder(
            name = "CommentBlock03",
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
        moveTo(9.6f, 8.05f)
        lineTo(14.5f, 12.95f)
        moveTo(15.55f, 10.5f)
        curveTo(15.55f, 8.567f, 13.983f, 7f, 12.05f, 7f)
        curveTo(10.117f, 7f, 8.55f, 8.567f, 8.55f, 10.5f)
        curveTo(8.55f, 12.433f, 10.117f, 14f, 12.05f, 14f)
        curveTo(13.983f, 14f, 15.55f, 12.433f, 15.55f, 10.5f)
        }

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
        }.build()

        return _commentBlock03!!
    }

private var _commentBlock03: ImageVector? = null
