package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Exchange01: ImageVector
    get() {
        if (_exchange01 != null) {
            return _exchange01!!
        }
        _exchange01 = ImageVector.Builder(
            name = "Exchange01",
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
        moveTo(16.9767f, 19.5f)
        curveTo(19.4017f, 17.8876f, 21f, 15.1305f, 21f, 12f)
        curveTo(21f, 7.02944f, 16.9706f, 3f, 12f, 3f)
        curveTo(11.3126f, 3f, 10.6432f, 3.07706f, 10f, 3.22302f)
        moveTo(16.9767f, 19.5f)
        verticalLineTo(16f)
        moveTo(16.9767f, 19.5f)
        horizontalLineTo(20.5f)
        moveTo(7f, 4.51555f)
        curveTo(4.58803f, 6.13007f, 3f, 8.87958f, 3f, 12f)
        curveTo(3f, 16.9706f, 7.02944f, 21f, 12f, 21f)
        curveTo(12.6874f, 21f, 13.3568f, 20.9229f, 14f, 20.777f)
        moveTo(7f, 4.51555f)
        verticalLineTo(8f)
        moveTo(7f, 4.51555f)
        horizontalLineTo(3.5f)
        }
        }.build()

        return _exchange01!!
    }

private var _exchange01: ImageVector? = null
