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

val HugeIcons.Music: ImageVector
    get() {
        if (_music != null) {
            return _music!!
        }
        _music = ImageVector.Builder(
            name = "Music",
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
            moveTo(13.49249f, 17f)
            arcTo(4f, 4f, 0f, true, false, 5.49249f, 17f)
            arcTo(4f, 4f, 0f, true, false, 13.49249f, 17f)
            close()
        }

        path(
            fill = SolidColor(Color(0xFF141B34)),
            stroke = null,
            fillAlpha = 1f,
            strokeAlpha = 1f,
            strokeLineWidth = 1f,
            strokeLineCap = StrokeCap.Butt,
            strokeLineJoin = StrokeJoin.Miter,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(14.2425f, 3f)
            curveTo(14.2425f, 2.58579f, 13.9067f, 2.25f, 13.4925f, 2.25f)
            curveTo(13.0783f, 2.25f, 12.7425f, 2.58579f, 12.7425f, 3f)
            horizontalLineTo(13.4925f)
            horizontalLineTo(14.2425f)
            close()
            moveTo(16.6211f, 11.5356f)
            curveTo(16.3647f, 11.8608f, 16.4204f, 12.3324f, 16.7457f, 12.5889f)
            curveTo(17.0709f, 12.8454f, 17.5425f, 12.7897f, 17.799f, 12.4644f)
            lineTo(17.2101f, 12f)
            lineTo(16.6211f, 11.5356f)
            close()
            moveTo(13.4925f, 3f)
            horizontalLineTo(12.7425f)
            curveTo(12.7425f, 4.29862f, 13.4137f, 5.20585f, 14.1893f, 5.8847f)
            curveTo(14.5723f, 6.21986f, 14.9965f, 6.5139f, 15.3975f, 6.78012f)
            curveTo(15.8128f, 7.0558f, 16.1867f, 7.2914f, 16.5387f, 7.54556f)
            curveTo(17.2554f, 8.06308f, 17.6329f, 8.4914f, 17.7213f, 8.97169f)
            curveTo(17.8076f, 9.44028f, 17.66f, 10.2182f, 16.6211f, 11.5356f)
            lineTo(17.2101f, 12f)
            lineTo(17.799f, 12.4644f)
            curveTo(18.9287f, 11.0318f, 19.4007f, 9.80972f, 19.1965f, 8.70019f)
            curveTo(18.9945f, 7.60235f, 18.1715f, 6.87442f, 17.4168f, 6.32944f)
            curveTo(17.033f, 6.05235f, 16.6033f, 5.78013f, 16.2271f, 5.53042f)
            curveTo(15.8367f, 5.27126f, 15.4816f, 5.02232f, 15.1772f, 4.75593f)
            curveTo(14.5782f, 4.23165f, 14.2425f, 3.70138f, 14.2425f, 3f)
            horizontalLineTo(13.4925f)
            close()
            moveTo(13.4925f, 3f)
            horizontalLineTo(12.7425f)
            verticalLineTo(17f)
            horizontalLineTo(13.4925f)
            horizontalLineTo(14.2425f)
            verticalLineTo(3f)
            horizontalLineTo(13.4925f)
            close()
        }
        }.build()

        return _music!!
    }

private var _music: ImageVector? = null
