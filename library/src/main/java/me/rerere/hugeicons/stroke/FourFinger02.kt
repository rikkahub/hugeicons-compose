package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.FourFinger02: ImageVector
    get() {
        if (_fourFinger02 != null) {
            return _fourFinger02!!
        }
        _fourFinger02 = ImageVector.Builder(
            name = "FourFinger02",
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
        moveTo(7.84051f, 13.4813f)
        verticalLineTo(4.98823f)
        curveTo(7.84051f, 4.1585f, 8.50582f, 3.48586f, 9.32652f, 3.48586f)
        curveTo(10.1472f, 3.48586f, 10.8125f, 4.15828f, 10.8125f, 4.98802f)
        moveTo(10.8125f, 9.97422f)
        verticalLineTo(3.50238f)
        curveTo(10.8125f, 2.67264f, 11.4778f, 2f, 12.2986f, 2f)
        curveTo(13.1193f, 2f, 13.7846f, 2.67264f, 13.7846f, 3.50238f)
        verticalLineTo(11.0057f)
        moveTo(13.7846f, 5.47656f)
        curveTo(13.7846f, 4.64306f, 14.4836f, 3.9678f, 15.308f, 3.9678f)
        curveTo(16.1324f, 3.9678f, 16.8008f, 4.64348f, 16.8008f, 5.47699f)
        verticalLineTo(11.9989f)
        moveTo(16.8008f, 7.51562f)
        curveTo(16.8008f, 6.69224f, 17.461f, 6.02157f, 18.2754f, 6.02157f)
        curveTo(19.0898f, 6.02157f, 19.75f, 6.68905f, 19.75f, 7.51243f)
        verticalLineTo(16.1246f)
        curveTo(19.75f, 17.1574f, 19.3743f, 18.3101f, 18.2322f, 19.6845f)
        curveTo(17.9015f, 20.0825f, 17.6958f, 20.5766f, 17.6958f, 21.0964f)
        verticalLineTo(22f)
        moveTo(7.84051f, 8.85627f)
        curveTo(7.00785f, 9.63725f, 4.99016f, 11.6991f, 4.43639f, 12.8432f)
        curveTo(3.88262f, 13.9873f, 4.7059f, 15.3388f, 5.05201f, 15.8682f)
        lineTo(7.84008f, 19.5755f)
        curveTo(8.10344f, 19.9257f, 8.24603f, 20.3535f, 8.24603f, 20.7935f)
        verticalLineTo(22f)
        }
        }.build()

        return _fourFinger02!!
    }

private var _fourFinger02: ImageVector? = null
