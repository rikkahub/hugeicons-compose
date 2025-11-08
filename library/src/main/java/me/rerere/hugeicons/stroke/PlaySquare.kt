package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.PlaySquare: ImageVector
    get() {
        if (_playSquare != null) {
            return _playSquare!!
        }
        _playSquare = ImageVector.Builder(
            name = "PlaySquare",
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
        moveTo(14.9531f, 12.3948f)
        curveTo(14.8016f, 13.0215f, 14.0857f, 13.4644f, 12.6539f, 14.3502f)
        curveTo(11.2697f, 15.2064f, 10.5777f, 15.6346f, 10.0199f, 15.4625f)
        curveTo(9.78934f, 15.3913f, 9.57925f, 15.2562f, 9.40982f, 15.07f)
        curveTo(9f, 14.6198f, 9f, 13.7465f, 9f, 12f)
        curveTo(9f, 10.2535f, 9f, 9.38018f, 9.40982f, 8.92995f)
        curveTo(9.57925f, 8.74381f, 9.78934f, 8.60868f, 10.0199f, 8.53753f)
        curveTo(10.5777f, 8.36544f, 11.2697f, 8.79357f, 12.6539f, 9.64983f)
        curveTo(14.0857f, 10.5356f, 14.8016f, 10.9785f, 14.9531f, 11.6052f)
        curveTo(15.0156f, 11.8639f, 15.0156f, 12.1361f, 14.9531f, 12.3948f)
        }

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
        }.build()

        return _playSquare!!
    }

private var _playSquare: ImageVector? = null
