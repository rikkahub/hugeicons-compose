package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Sent: ImageVector
    get() {
        if (_sent != null) {
            return _sent!!
        }
        _sent = ImageVector.Builder(
            name = "Sent",
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
        moveTo(21.0477f, 3.05293f)
        curveTo(18.8697f, 0.707363f, 2.48648f, 6.4532f, 2.50001f, 8.551f)
        curveTo(2.51535f, 10.9299f, 8.89809f, 11.6617f, 10.6672f, 12.1581f)
        curveTo(11.7311f, 12.4565f, 12.016f, 12.7625f, 12.2613f, 13.8781f)
        curveTo(13.3723f, 18.9305f, 13.9301f, 21.4435f, 15.2014f, 21.4996f)
        curveTo(17.2278f, 21.5892f, 23.1733f, 5.342f, 21.0477f, 3.05293f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(11.5f, 12.5f)
        lineTo(15f, 9f)
        }
        }.build()

        return _sent!!
    }

private var _sent: ImageVector? = null
