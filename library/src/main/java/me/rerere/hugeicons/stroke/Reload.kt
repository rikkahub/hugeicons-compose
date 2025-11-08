package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Reload: ImageVector
    get() {
        if (_reload != null) {
            return _reload!!
        }
        _reload = ImageVector.Builder(
            name = "Reload",
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
        moveTo(15.1667f, 0.999756f)
        lineTo(15.7646f, 2.11753f)
        curveTo(16.1689f, 2.87322f, 16.371f, 3.25107f, 16.2374f, 3.41289f)
        curveTo(16.1037f, 3.57471f, 15.6635f, 3.44402f, 14.7831f, 3.18264f)
        curveTo(13.9029f, 2.92131f, 12.9684f, 2.78071f, 12f, 2.78071f)
        curveTo(6.75329f, 2.78071f, 2.5f, 6.90822f, 2.5f, 11.9998f)
        curveTo(2.5f, 13.6789f, 2.96262f, 15.2533f, 3.77093f, 16.6093f)
        moveTo(8.83333f, 22.9998f)
        lineTo(8.23536f, 21.882f)
        curveTo(7.83108f, 21.1263f, 7.62894f, 20.7484f, 7.7626f, 20.5866f)
        curveTo(7.89627f, 20.4248f, 8.33649f, 20.5555f, 9.21689f, 20.8169f)
        curveTo(10.0971f, 21.0782f, 11.0316f, 21.2188f, 12f, 21.2188f)
        curveTo(17.2467f, 21.2188f, 21.5f, 17.0913f, 21.5f, 11.9998f)
        curveTo(21.5f, 10.3206f, 21.0374f, 8.74623f, 20.2291f, 7.39023f)
        }
        }.build()

        return _reload!!
    }

private var _reload: ImageVector? = null
