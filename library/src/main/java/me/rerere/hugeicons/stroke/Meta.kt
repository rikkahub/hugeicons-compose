package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Meta: ImageVector
    get() {
        if (_meta != null) {
            return _meta!!
        }
        _meta = ImageVector.Builder(
            name = "Meta",
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
        moveTo(12f, 9.86967f)
        curveTo(13.9623f, 6.62167f, 15.6835f, 5f, 17.1647f, 5f)
        curveTo(19.387f, 5f, 20.7904f, 7.58183f, 21.6093f, 11.0865f)
        curveTo(22.3915f, 14.4337f, 22.1649f, 19f, 19.387f, 19f)
        curveTo(18.1491f, 19f, 16.4446f, 17.1742f, 14.7779f, 14.7393f)
        curveTo(13.7173f, 13.205f, 12.7878f, 11.5755f, 12f, 9.86967f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12f, 9.86967f)
        curveTo(9.84147f, 6.62167f, 7.94817f, 5f, 6.31888f, 5f)
        curveTo(3.87433f, 5f, 2.3306f, 7.58183f, 1.42978f, 11.0865f)
        curveTo(0.569303f, 14.4337f, 0.818647f, 19f, 3.87433f, 19f)
        curveTo(5.23594f, 19f, 7.11091f, 17.1742f, 8.94432f, 14.7393f)
        curveTo(10.1666f, 13.1165f, 11.1847f, 11.4925f, 12f, 9.86967f)
        }
        }.build()

        return _meta!!
    }

private var _meta: ImageVector? = null
