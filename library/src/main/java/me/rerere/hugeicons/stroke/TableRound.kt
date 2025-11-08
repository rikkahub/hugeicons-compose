package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.TableRound: ImageVector
    get() {
        if (_tableRound != null) {
            return _tableRound!!
        }
        _tableRound = ImageVector.Builder(
            name = "TableRound",
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
        moveTo(12f, 20.5f)
        curveTo(12.8284f, 20.5f, 13.5898f, 20.2551f, 14.1904f, 19.8455f)
        curveTo(14.4774f, 19.6498f, 14.5909f, 19.242f, 14.4189f, 18.9153f)
        curveTo(14.0734f, 18.2595f, 13.3308f, 17.5f, 12f, 17.5f)
        curveTo(10.6692f, 17.5f, 9.92656f, 18.2595f, 9.58115f, 18.9153f)
        curveTo(9.40905f, 19.242f, 9.52257f, 19.6498f, 9.8096f, 19.8455f)
        curveTo(10.4102f, 20.2551f, 11.1716f, 20.5f, 12f, 20.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12f, 17.5f)
        verticalLineTo(9.5f)
        }
        }.build()

        return _tableRound!!
    }

private var _tableRound: ImageVector? = null
