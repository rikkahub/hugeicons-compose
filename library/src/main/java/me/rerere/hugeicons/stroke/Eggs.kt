package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Eggs: ImageVector
    get() {
        if (_eggs != null) {
            return _eggs!!
        }
        _eggs = ImageVector.Builder(
            name = "Eggs",
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
        moveTo(12f, 4.31768f)
        curveTo(14.2461f, 2.34541f, 17.0188f, 1.33526f, 19.1747f, 2.48374f)
        curveTo(22.5319f, 4.27221f, 22.7145f, 10.4012f, 20.684f, 14.5638f)
        curveTo(19.8309f, 16.3126f, 18.7032f, 17.4255f, 17.4415f, 18f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(15f, 15.5f)
        curveTo(15f, 19.9183f, 12.0899f, 22f, 8.5f, 22f)
        curveTo(4.91015f, 22f, 2f, 19.9183f, 2f, 15.5f)
        curveTo(2f, 11.0817f, 4.78571f, 6f, 8.5f, 6f)
        curveTo(12.2143f, 6f, 15f, 11.0817f, 15f, 15.5f)
        }
        }.build()

        return _eggs!!
    }

private var _eggs: ImageVector? = null
