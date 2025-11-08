package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.TickDouble01: ImageVector
    get() {
        if (_tickDouble01 != null) {
            return _tickDouble01!!
        }
        _tickDouble01 = ImageVector.Builder(
            name = "TickDouble01",
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
        moveTo(3f, 13.3333f)
        curveTo(3f, 13.3333f, 4.5f, 14f, 6.5f, 17f)
        curveTo(6.5f, 17f, 6.78485f, 16.5192f, 7.32133f, 15.7526f)
        moveTo(17f, 6f)
        curveTo(14.7085f, 7.14577f, 12.3119f, 9.55181f, 10.3879f, 11.8223f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(8f, 13.3333f)
        curveTo(8f, 13.3333f, 9.5f, 14f, 11.5f, 17f)
        curveTo(11.5f, 17f, 17f, 8.5f, 22f, 6f)
        }
        }.build()

        return _tickDouble01!!
    }

private var _tickDouble01: ImageVector? = null
