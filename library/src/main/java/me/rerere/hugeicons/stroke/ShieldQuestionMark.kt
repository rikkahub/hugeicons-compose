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

val HugeIcons.ShieldQuestionMark: ImageVector
    get() {
        if (_shieldQuestionMark != null) {
            return _shieldQuestionMark!!
        }
        _shieldQuestionMark = ImageVector.Builder(
            name = "ShieldQuestionMark",
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
            moveTo(9.5f, 9f)
            curveTo(9.5f, 7.61929f, 10.6193f, 6.5f, 12f, 6.5f)
            curveTo(13.3807f, 6.5f, 14.5f, 7.61929f, 14.5f, 9f)
            curveTo(14.5f, 9.85691f, 14.0689f, 10.6131f, 13.4117f, 11.0636f)
            curveTo(12.7283f, 11.5319f, 12f, 12.1716f, 12f, 13f)
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
            moveTo(12.125f, 16.25f)
            horizontalLineTo(12f)
            moveTo(12.25f, 16.25f)
            curveTo(12.25f, 16.3881f, 12.1381f, 16.5f, 12f, 16.5f)
            curveTo(11.8619f, 16.5f, 11.75f, 16.3881f, 11.75f, 16.25f)
            curveTo(11.75f, 16.1119f, 11.8619f, 16f, 12f, 16f)
            curveTo(12.1381f, 16f, 12.25f, 16.1119f, 12.25f, 16.25f)
            close()
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
            moveTo(18.7088f, 3.49534f)
            curveTo(16.8165f, 2.55382f, 14.5009f, 2f, 12f, 2f)
            curveTo(9.4991f, 2f, 7.1835f, 2.55382f, 5.29116f, 3.49534f)
            curveTo(4.36318f, 3.95706f, 3.89919f, 4.18792f, 3.4496f, 4.91378f)
            curveTo(3f, 5.63965f, 3f, 6.34248f, 3f, 7.74814f)
            verticalLineTo(11.2371f)
            curveTo(3f, 16.9205f, 7.54236f, 20.0804f, 10.173f, 21.4338f)
            curveTo(10.9067f, 21.8113f, 11.2735f, 22f, 12f, 22f)
            curveTo(12.7265f, 22f, 13.0933f, 21.8113f, 13.8269f, 21.4338f)
            curveTo(16.4576f, 20.0804f, 21f, 16.9205f, 21f, 11.2371f)
            lineTo(21f, 7.74814f)
            curveTo(21f, 6.34249f, 21f, 5.63966f, 20.5504f, 4.91378f)
            curveTo(20.1008f, 4.18791f, 19.6368f, 3.95706f, 18.7088f, 3.49534f)
            close()
        }
        }.build()

        return _shieldQuestionMark!!
    }

private var _shieldQuestionMark: ImageVector? = null
