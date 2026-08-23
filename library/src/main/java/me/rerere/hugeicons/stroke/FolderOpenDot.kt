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

val HugeIcons.FolderOpenDot: ImageVector
    get() {
        if (_folderOpenDot != null) {
            return _folderOpenDot!!
        }
        _folderOpenDot = ImageVector.Builder(
            name = "FolderOpenDot",
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
            moveTo(12.75f, 14.75f)
            verticalLineTo(15f)
            moveTo(13.25f, 15f)
            curveTo(13.25f, 15.2761f, 13.0261f, 15.5f, 12.75f, 15.5f)
            curveTo(12.4739f, 15.5f, 12.25f, 15.2761f, 12.25f, 15f)
            curveTo(12.25f, 14.7239f, 12.4739f, 14.5f, 12.75f, 14.5f)
            curveTo(13.0261f, 14.5f, 13.25f, 14.7239f, 13.25f, 15f)
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
            moveTo(20.25f, 10f)
            curveTo(20.25f, 8.59554f, 20.25f, 7.89331f, 19.9129f, 7.38886f)
            curveTo(19.767f, 7.17048f, 19.5795f, 6.98298f, 19.3611f, 6.83706f)
            curveTo(18.8567f, 6.5f, 18.1545f, 6.5f, 16.75f, 6.5f)
            horizontalLineTo(12.8508f)
            curveTo(12.2242f, 6.5f, 11.9109f, 6.5f, 11.6239f, 6.41181f)
            curveTo(11.4324f, 6.35298f, 11.2509f, 6.26572f, 11.0853f, 6.15295f)
            curveTo(10.8371f, 5.98389f, 10.6414f, 5.73926f, 10.25f, 5.25f)
            curveTo(9.85859f, 4.76074f, 9.66289f, 4.51611f, 9.41469f, 4.34705f)
            curveTo(9.24914f, 4.23428f, 9.06759f, 4.14702f, 8.87612f, 4.08819f)
            curveTo(8.58906f, 4f, 8.27578f, 4f, 7.64922f, 4f)
            horizontalLineTo(6.25f)
            curveTo(4.36438f, 4f, 3.42157f, 4f, 2.83579f, 4.58579f)
            curveTo(2.25f, 5.17157f, 2.25f, 6.11438f, 2.25f, 8f)
            verticalLineTo(16f)
            curveTo(2.25f, 17.8856f, 2.25f, 18.8284f, 2.83579f, 19.4142f)
            curveTo(3.42157f, 20f, 4.36438f, 20f, 6.25f, 20f)
            horizontalLineTo(7.25f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF141B34)),
            fillAlpha = 1f,
            strokeAlpha = 1f,
            strokeLineWidth = 1.5f,
            strokeLineCap = StrokeCap.Butt,
            strokeLineJoin = StrokeJoin.Miter,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(5.60252f, 12.8506f)
            lineTo(5.00864f, 14.8506f)
            curveTo(4.30844f, 17.2087f, 3.95833f, 18.3877f, 4.55201f, 19.1939f)
            curveTo(5.14568f, 20f, 6.36407f, 20f, 8.80085f, 20f)
            horizontalLineTo(16.1409f)
            curveTo(17.4392f, 20f, 18.0883f, 20f, 18.591f, 19.6561f)
            curveTo(19.0937f, 19.3123f, 19.3348f, 18.7034f, 19.8169f, 17.4856f)
            lineTo(20.6088f, 15.4856f)
            curveTo(21.5928f, 13.0002f, 22.0848f, 11.7575f, 21.4959f, 10.8787f)
            curveTo(20.9071f, 10f, 19.5823f, 10f, 16.9328f, 10f)
            horizontalLineTo(9.39473f)
            curveTo(7.97571f, 10f, 7.2662f, 10f, 6.74017f, 10.3954f)
            curveTo(6.21415f, 10.7908f, 6.01027f, 11.4774f, 5.60252f, 12.8506f)
            close()
        }
        }.build()

        return _folderOpenDot!!
    }

private var _folderOpenDot: ImageVector? = null
