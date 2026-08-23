package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Wheat: ImageVector
    get() {
        if (_wheat != null) {
            return _wheat!!
        }
        _wheat = ImageVector.Builder(
            name = "Wheat",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
        path(
            fill = null,
            stroke = SolidColor(Color(0xFF141B34)),
            fillAlpha = 1f,
            strokeAlpha = 1f,
            strokeLineWidth = 1.5f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(14.3498f, 9.65091f)
            lineTo(3f, 21f)
            moveTo(19.67f, 8.58588f)
            curveTo(17.5419f, 10.7138f, 14.3498f, 9.64986f, 14.3498f, 9.64986f)
            curveTo(14.3498f, 9.64986f, 13.2857f, 6.45793f, 15.4138f, 4.32997f)
            curveTo(16.8028f, 2.94105f, 18.6451f, 2.91196f, 19.7572f, 3.05928f)
            curveTo(20.3813f, 3.14194f, 20.8581f, 3.61868f, 20.9407f, 4.24275f)
            curveTo(21.088f, 5.35481f, 21.0589f, 7.19698f, 19.67f, 8.58588f)
            close()
            moveTo(15.7685f, 15.6803f)
            curveTo(12.931f, 15.6803f, 11.5123f, 12.843f, 11.5123f, 12.843f)
            curveTo(11.5123f, 12.843f, 12.931f, 10.0057f, 15.7685f, 10.0057f)
            curveTo(17.5878f, 10.0057f, 18.8238f, 11.1722f, 19.4766f, 12.0092f)
            curveTo(19.8638f, 12.5057f, 19.8638f, 13.1803f, 19.4766f, 13.6767f)
            curveTo(18.8238f, 14.5138f, 17.5878f, 15.6803f, 15.7685f, 15.6803f)
            close()
            moveTo(8.3202f, 8.23242f)
            curveTo(8.3202f, 11.0697f, 11.1576f, 12.4883f, 11.1576f, 12.4883f)
            curveTo(11.1576f, 12.4883f, 13.9951f, 11.0697f, 13.9951f, 8.23242f)
            curveTo(13.9951f, 6.41314f, 12.8285f, 5.17713f, 11.9913f, 4.52438f)
            curveTo(11.4949f, 4.13732f, 10.8204f, 4.13732f, 10.3239f, 4.52438f)
            curveTo(9.4868f, 5.17713f, 8.3202f, 6.41314f, 8.3202f, 8.23242f)
            close()
            moveTo(11.1576f, 20.2903f)
            curveTo(8.3202f, 20.2903f, 6.90148f, 17.4531f, 6.90148f, 17.4531f)
            curveTo(6.90148f, 17.4531f, 8.3202f, 14.6158f, 11.1576f, 14.6158f)
            curveTo(12.9769f, 14.6158f, 14.213f, 15.7822f, 14.8658f, 16.6193f)
            curveTo(15.253f, 17.1157f, 15.253f, 17.7904f, 14.8658f, 18.2868f)
            curveTo(14.213f, 19.1239f, 12.9769f, 20.2903f, 11.1576f, 20.2903f)
            close()
            moveTo(3.70936f, 12.8425f)
            curveTo(3.70936f, 15.6798f, 6.5468f, 17.0984f, 6.5468f, 17.0984f)
            curveTo(6.5468f, 17.0984f, 9.38424f, 15.6798f, 9.38424f, 12.8425f)
            curveTo(9.38424f, 11.0232f, 8.21763f, 9.78721f, 7.3805f, 9.13446f)
            curveTo(6.88408f, 8.74739f, 6.20952f, 8.74739f, 5.71311f, 9.13446f)
            curveTo(4.87597f, 9.7872f, 3.70936f, 11.0232f, 3.70936f, 12.8425f)
            close()
        }
        }.build()

        return _wheat!!
    }

private var _wheat: ImageVector? = null
