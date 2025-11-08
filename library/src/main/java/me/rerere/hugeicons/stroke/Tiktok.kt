package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Tiktok: ImageVector
    get() {
        if (_tiktok != null) {
            return _tiktok!!
        }
        _tiktok = ImageVector.Builder(
            name = "Tiktok",
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
        moveTo(10.5359f, 11.0075f)
        curveTo(9.71585f, 10.8916f, 7.84666f, 11.0834f, 6.93011f, 12.7782f)
        curveTo(6.01355f, 14.4729f, 6.9373f, 16.2368f, 7.51374f, 16.9069f)
        curveTo(8.08298f, 17.5338f, 9.89226f, 18.721f, 11.8114f, 17.5619f)
        curveTo(12.2871f, 17.2746f, 12.8797f, 17.0603f, 13.552f, 14.8153f)
        lineTo(13.4738f, 5.98145f)
        curveTo(13.3441f, 6.95419f, 14.4186f, 9.23575f, 17.478f, 9.5057f)
        }
        }.build()

        return _tiktok!!
    }

private var _tiktok: ImageVector? = null
