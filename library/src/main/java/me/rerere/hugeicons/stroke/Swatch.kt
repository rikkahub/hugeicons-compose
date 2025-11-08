package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Swatch: ImageVector
    get() {
        if (_swatch != null) {
            return _swatch!!
        }
        _swatch = ImageVector.Builder(
            name = "Swatch",
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
        moveTo(16.5551f, 4f)
        curveTo(17.0179f, 4.42885f, 17.5421f, 4.96506f, 18.1713f, 5.60862f)
        curveTo(20.0571f, 7.53758f, 21f, 8.50206f, 21f, 9.70056f)
        curveTo(21f, 10.8991f, 20.0571f, 11.8635f, 18.1713f, 13.7925f)
        lineTo(11.7706f, 20.3396f)
        curveTo(11.5289f, 20.5868f, 11.2709f, 20.8069f, 11f, 21f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(2f, 16.6153f)
        curveTo(2f, 19.5892f, 4.48731f, 22f, 7.55556f, 22f)
        horizontalLineTo(16.4444f)
        curveTo(19.0634f, 22f, 20.3728f, 22f, 21.1864f, 21.2114f)
        curveTo(22f, 20.4229f, 22f, 19.1537f, 22f, 16.6153f)
        curveTo(22f, 16.0078f, 22f, 15.4729f, 21.9888f, 15f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(2f, 7.55556f)
        curveTo(2f, 4.93664f, 2f, 3.62718f, 2.80546f, 2.81359f)
        curveTo(3.61091f, 2f, 4.90728f, 2f, 7.5f, 2f)
        curveTo(10.0927f, 2f, 11.3891f, 2f, 12.1945f, 2.81359f)
        curveTo(13f, 3.62718f, 13f, 4.93664f, 13f, 7.55556f)
        verticalLineTo(16.4444f)
        curveTo(13f, 19.5127f, 10.5376f, 22f, 7.5f, 22f)
        curveTo(4.46243f, 22f, 2f, 19.5127f, 2f, 16.4444f)
        verticalLineTo(7.55556f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(7.5f, 17.5f)
        horizontalLineTo(7.50898f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(2f, 8f)
        horizontalLineTo(13f)
        moveTo(2f, 13f)
        horizontalLineTo(13f)
        }
        }.build()

        return _swatch!!
    }

private var _swatch: ImageVector? = null
