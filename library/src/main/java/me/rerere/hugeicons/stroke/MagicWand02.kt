package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.MagicWand02: ImageVector
    get() {
        if (_magicWand02 != null) {
            return _magicWand02!!
        }
        _magicWand02 = ImageVector.Builder(
            name = "MagicWand02",
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
        moveTo(17.5f, 17.5f)
        lineTo(21.5f, 21.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(5.97185f, 3.79282f)
        lineTo(9.31786f, 4.92059f)
        curveTo(9.78049f, 5.08073f, 10.4825f, 4.97602f, 10.88f, 4.69283f)
        lineTo(13.2273f, 3.01883f)
        curveTo(14.729f, 1.949f, 15.972f, 2.58706f, 15.9733f, 4.44162f)
        lineTo(15.9862f, 7.58112f)
        curveTo(15.9884f, 8.11281f, 16.3582f, 8.7726f, 16.8087f, 9.05928f)
        lineTo(19.207f, 10.5629f)
        curveTo(21.104f, 11.7544f, 20.8884f, 13.1649f, 18.7263f, 13.713f)
        lineTo(15.7172f, 14.4729f)
        curveTo(15.1735f, 14.6099f, 14.6126f, 15.1709f, 14.4693f, 15.721f)
        lineTo(13.7096f, 18.7307f)
        curveTo(13.1679f, 20.8868f, 11.7449f, 21.1025f, 10.5601f, 19.2114f)
        lineTo(9.0567f, 16.8127f)
        curveTo(8.77007f, 16.3621f, 8.1104f, 15.9923f, 7.57881f, 15.9901f)
        lineTo(4.43989f, 15.9772f)
        curveTo(2.59198f, 15.9696f, 1.94773f, 14.7327f, 3.01737f, 13.2306f)
        lineTo(4.69105f, 10.8829f)
        curveTo(4.96789f, 10.4917f, 5.07258f, 9.78951f, 4.91247f, 9.3268f)
        lineTo(3.78491f, 5.98017f)
        curveTo(3.17623f, 4.16109f, 4.15941f, 3.17773f, 5.97185f, 3.79282f)
        }
        }.build()

        return _magicWand02!!
    }

private var _magicWand02: ImageVector? = null
