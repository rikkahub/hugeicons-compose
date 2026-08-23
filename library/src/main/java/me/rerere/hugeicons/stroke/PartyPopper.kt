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

val HugeIcons.PartyPopper: ImageVector
    get() {
        if (_partyPopper != null) {
            return _partyPopper!!
        }
        _partyPopper = ImageVector.Builder(
            name = "PartyPopper",
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
            moveTo(15.9924f, 8f)
            lineTo(18.9924f, 5f)
        }

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
            moveTo(14.1897f, 2f)
            curveTo(14.5888f, 2.66667f, 14.908f, 4.4f, 12.9924f, 6f)
        }

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
            moveTo(21.9924f, 9.80274f)
            curveTo(21.3257f, 9.40365f, 19.5924f, 9.08438f, 17.9924f, 11f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF141B34)),
            fillAlpha = 1f,
            strokeAlpha = 1f,
            strokeLineWidth = 1.5f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Miter,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(5.82422f, 11f)
            curveTo(7.97359f, 12.572f, 10.6237f, 13.5f, 13.4906f, 13.5f)
            curveTo(14.1707f, 13.5f, 14.8386f, 13.4478f, 15.4906f, 13.3471f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF141B34)),
            fillAlpha = 1f,
            strokeAlpha = 1f,
            strokeLineWidth = 1.5f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Miter,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(3.49219f, 16.5f)
            curveTo(5.70483f, 17.7609f, 8.22705f, 18.4748f, 10.904f, 18.4748f)
            curveTo(11.44f, 18.4748f, 11.9698f, 18.5312f, 12.4922f, 18.4753f)
        }

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
            moveTo(5.64917f, 11.0022f)
            lineTo(4.1788f, 14.3105f)
            curveTo(2.32373f, 18.4844f, 1.3962f, 20.5713f, 2.40852f, 21.5837f)
            curveTo(3.42084f, 22.596f, 5.5078f, 21.6685f, 9.6817f, 19.8134f)
            lineTo(12.99f, 18.343f)
            curveTo(15.5074f, 17.2242f, 16.7661f, 16.6647f, 16.9664f, 15.586f)
            curveTo(17.1667f, 14.5073f, 16.1928f, 13.5333f, 14.2448f, 11.5854f)
            lineTo(12.4068f, 9.7474f)
            curveTo(10.4589f, 7.79944f, 9.48487f, 6.82546f, 8.40616f, 7.02575f)
            curveTo(7.32744f, 7.22604f, 6.76802f, 8.48475f, 5.64917f, 11.0022f)
            close()
        }
        }.build()

        return _partyPopper!!
    }

private var _partyPopper: ImageVector? = null
