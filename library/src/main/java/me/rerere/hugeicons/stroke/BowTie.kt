package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.BowTie: ImageVector
    get() {
        if (_bowTie != null) {
            return _bowTie!!
        }
        _bowTie = ImageVector.Builder(
            name = "BowTie",
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
        moveTo(10f, 9.5022f)
        curveTo(9f, 8.50179f, 6.02143f, 5.77926f, 4.66065f, 6.01432f)
        curveTo(1.11312f, 6.62711f, 1.11312f, 17.3771f, 4.66065f, 17.9899f)
        curveTo(6.02143f, 18.2249f, 9f, 15.5025f, 10f, 14.5021f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(14f, 9.5022f)
        curveTo(15f, 8.50179f, 17.9786f, 5.77926f, 19.3393f, 6.01432f)
        curveTo(22.8869f, 6.62711f, 22.8869f, 17.3771f, 19.3393f, 17.9899f)
        curveTo(17.9786f, 18.2249f, 15f, 15.5025f, 14f, 14.5022f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(9.5f, 12.002f)
        curveTo(9.5f, 9.90315f, 10.1219f, 9.00195f, 12f, 9.00195f)
        curveTo(13.749f, 9.00195f, 14.5f, 9.74822f, 14.5f, 12.002f)
        curveTo(14.5f, 14.1008f, 13.8781f, 15.002f, 12f, 15.002f)
        curveTo(10.1219f, 15.002f, 9.5f, 14.1008f, 9.5f, 12.002f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(9f, 12.002f)
        horizontalLineTo(8f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(16f, 12.002f)
        horizontalLineTo(15f)
        }
        }.build()

        return _bowTie!!
    }

private var _bowTie: ImageVector? = null
