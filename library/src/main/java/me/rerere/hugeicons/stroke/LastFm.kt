package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.LastFm: ImageVector
    get() {
        if (_lastFm != null) {
            return _lastFm!!
        }
        _lastFm = ImageVector.Builder(
            name = "LastFm",
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
        moveTo(2.5f, 12f)
        curveTo(2.5f, 7.52166f, 2.5f, 5.28249f, 3.89124f, 3.89124f)
        curveTo(5.28249f, 2.5f, 7.52166f, 2.5f, 12f, 2.5f)
        curveTo(16.4783f, 2.5f, 18.7175f, 2.5f, 20.1088f, 3.89124f)
        curveTo(21.5f, 5.28249f, 21.5f, 7.52166f, 21.5f, 12f)
        curveTo(21.5f, 16.4783f, 21.5f, 18.7175f, 20.1088f, 20.1088f)
        curveTo(18.7175f, 21.5f, 16.4783f, 21.5f, 12f, 21.5f)
        curveTo(7.52166f, 21.5f, 5.28249f, 21.5f, 3.89124f, 20.1088f)
        curveTo(2.5f, 18.7175f, 2.5f, 16.4783f, 2.5f, 12f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(11.0714f, 15.0318f)
        curveTo(10.5251f, 15.3296f, 9.89082f, 15.5f, 9.21429f, 15.5f)
        curveTo(7.16294f, 15.5f, 5.5f, 13.933f, 5.5f, 12f)
        curveTo(5.5f, 10.067f, 7.16294f, 8.5f, 9.21429f, 8.5f)
        curveTo(11.4777f, 8.66528f, 12.1577f, 10.6609f, 12.5678f, 12f)
        curveTo(13.4964f, 15.0318f, 15.6172f, 15.5f, 16.6429f, 15.5f)
        curveTo(17.6685f, 15.5f, 18.5f, 14.7165f, 18.5f, 13.75f)
        curveTo(18.5f, 12.7835f, 17.6685f, 12f, 16.6429f, 12f)
        curveTo(15.6172f, 12f, 14.7857f, 11.2165f, 14.7857f, 10.25f)
        curveTo(14.7857f, 9.2835f, 15.6172f, 8.5f, 16.6429f, 8.5f)
        curveTo(17.5759f, 8.5f, 18.3483f, 9.14843f, 18.4801f, 9.99317f)
        }
        }.build()

        return _lastFm!!
    }

private var _lastFm: ImageVector? = null
