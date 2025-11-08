package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Fire03: ImageVector
    get() {
        if (_fire03 != null) {
            return _fire03!!
        }
        _fire03 = ImageVector.Builder(
            name = "Fire03",
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
        moveTo(12f, 21.5008f)
        curveTo(16.4183f, 21.5008f, 20f, 17.9191f, 20f, 13.5008f)
        curveTo(20f, 10.5397f, 18.3912f, 6.60684f, 16f, 4.33478f)
        lineTo(14f, 6.99915f)
        lineTo(10.5f, 2.49915f)
        curveTo(7f, 4.99915f, 4f, 9.59526f, 4f, 13.5008f)
        curveTo(4f, 17.9191f, 7.58172f, 21.5008f, 12f, 21.5008f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12f, 18.4991f)
        curveTo(14.2091f, 18.4991f, 16f, 16.4844f, 16f, 13.9991f)
        curveTo(16f, 13.2081f, 15.8186f, 12.4648f, 15.5f, 11.8189f)
        lineTo(13.5f, 13.4991f)
        lineTo(10.5f, 9.49811f)
        curveTo(9.5f, 10.4981f, 8f, 12.1106f, 8f, 13.9991f)
        curveTo(8f, 16.4844f, 9.79086f, 18.4991f, 12f, 18.4991f)
        }
        }.build()

        return _fire03!!
    }

private var _fire03: ImageVector? = null
