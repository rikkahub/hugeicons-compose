package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Office365: ImageVector
    get() {
        if (_office365 != null) {
            return _office365!!
        }
        _office365 = ImageVector.Builder(
            name = "Office365",
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
        moveTo(4f, 18f)
        verticalLineTo(6f)
        lineTo(14.5f, 2f)
        lineTo(20f, 4f)
        verticalLineTo(20f)
        lineTo(14.5f, 22f)
        lineTo(4f, 18f)
        moveTo(4f, 18f)
        lineTo(14f, 18.5f)
        verticalLineTo(6f)
        lineTo(8.5f, 7.5f)
        verticalLineTo(15.5f)
        lineTo(4f, 18f)
        }
        }.build()

        return _office365!!
    }

private var _office365: ImageVector? = null
