package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Attachment01: ImageVector
    get() {
        if (_attachment01 != null) {
            return _attachment01!!
        }
        _attachment01 = ImageVector.Builder(
            name = "Attachment01",
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
        moveTo(5.82338f, 12f)
        lineTo(4.27922f, 10.4558f)
        curveTo(2.57359f, 8.75022f, 2.57359f, 5.98485f, 4.27922f, 4.27922f)
        curveTo(5.98485f, 2.57359f, 8.75022f, 2.57359f, 10.4558f, 4.27922f)
        lineTo(19.7208f, 13.5442f)
        curveTo(21.4264f, 15.2498f, 21.4264f, 18.0152f, 19.7208f, 19.7208f)
        curveTo(18.0152f, 21.4264f, 15.2498f, 21.4264f, 13.5442f, 19.7208f)
        lineTo(10.0698f, 16.2464f)
        curveTo(9.00379f, 15.1804f, 9.00379f, 13.4521f, 10.0698f, 12.386f)
        curveTo(11.1358f, 11.32f, 12.8642f, 11.32f, 13.9302f, 12.386f)
        lineTo(15.8604f, 14.3162f)
        }
        }.build()

        return _attachment01!!
    }

private var _attachment01: ImageVector? = null
