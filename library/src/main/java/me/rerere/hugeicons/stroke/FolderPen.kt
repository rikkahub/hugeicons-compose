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

val HugeIcons.FolderPen: ImageVector
    get() {
        if (_folderPen != null) {
            return _folderPen!!
        }
        _folderPen = ImageVector.Builder(
            name = "FolderPen",
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
            moveTo(8f, 7f)
            horizontalLineTo(16.75f)
            curveTo(18.8567f, 7f, 19.91f, 7f, 20.6667f, 7.50559f)
            curveTo(20.9943f, 7.72447f, 21.2755f, 8.00572f, 21.4944f, 8.33329f)
            curveTo(22f, 9.08996f, 22f, 10.1433f, 22f, 12.25f)
            curveTo(22f, 15.7612f, 22f, 17.5167f, 21.1573f, 18.7779f)
            curveTo(20.7926f, 19.3238f, 20.3238f, 19.7926f, 19.7779f, 20.1573f)
            curveTo(18.5167f, 21f, 16.7612f, 21f, 13.25f, 21f)
            horizontalLineTo(12f)
            curveTo(11.2801f, 21f, 10.6152f, 21f, 10f, 20.9948f)
            moveTo(12f, 7f)
            lineTo(11.3666f, 5.73313f)
            curveTo(10.8418f, 4.68358f, 10.3622f, 3.62712f, 9.19926f, 3.19101f)
            curveTo(8.6899f, 3f, 8.10802f, 3f, 6.94427f, 3f)
            curveTo(5.1278f, 3f, 4.21956f, 3f, 3.53806f, 3.38032f)
            curveTo(3.05227f, 3.65142f, 2.65142f, 4.05227f, 2.38032f, 4.53806f)
            curveTo(2f, 5.21956f, 2f, 6.1278f, 2f, 7.94427f)
            verticalLineTo(11f)
            curveTo(2f, 11.7199f, 2f, 12.3848f, 2.00522f, 13f)
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
            moveTo(2f, 20.5f)
            verticalLineTo(19.6611f)
            curveTo(2f, 19.0548f, 2.24082f, 18.4735f, 2.66947f, 18.0448f)
            lineTo(7.31022f, 13.4041f)
            curveTo(7.56894f, 13.1453f, 7.91983f, 13f, 8.28571f, 13f)
            curveTo(8.65159f, 13f, 9.00249f, 13.1453f, 9.2612f, 13.4041f)
            lineTo(9.59594f, 13.7388f)
            curveTo(9.85466f, 13.9975f, 10f, 14.3484f, 10f, 14.7143f)
            curveTo(10f, 15.0802f, 9.85465f, 15.4311f, 9.59594f, 15.6898f)
            lineTo(4.95518f, 20.3305f)
            curveTo(4.52653f, 20.7592f, 3.94515f, 21f, 3.33894f, 21f)
            horizontalLineTo(2.5f)
            curveTo(2.22386f, 21f, 2f, 20.7761f, 2f, 20.5f)
            close()
        }
        }.build()

        return _folderPen!!
    }

private var _folderPen: ImageVector? = null
