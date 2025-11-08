package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.FolderCloud: ImageVector
    get() {
        if (_folderCloud != null) {
            return _folderCloud!!
        }
        _folderCloud = ImageVector.Builder(
            name = "FolderCloud",
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
        moveTo(8.00001f, 7.00116f)
        horizontalLineTo(16.75f)
        curveTo(18.8567f, 7.00116f, 19.9101f, 7.00116f, 20.6667f, 7.5069f)
        curveTo(20.9943f, 7.72584f, 21.2756f, 8.00717f, 21.4944f, 8.33484f)
        curveTo(21.9796f, 9.06117f, 21.9992f, 10.0608f, 22f, 12.0026f)
        verticalLineTo(13.0029f)
        moveTo(12f, 7.00116f)
        lineTo(11.3666f, 5.73392f)
        curveTo(10.8418f, 4.68406f, 10.3622f, 3.6273f, 9.19927f, 3.19106f)
        curveTo(8.68991f, 3f, 8.10803f, 3f, 6.94428f, 3f)
        curveTo(5.1278f, 3f, 4.21957f, 3f, 3.53807f, 3.38043f)
        curveTo(3.05227f, 3.65161f, 2.65142f, 4.05257f, 2.38032f, 4.53851f)
        curveTo(2f, 5.22021f, 2f, 6.12871f, 2f, 7.94571f)
        verticalLineTo(11.0023f)
        curveTo(2f, 15.7177f, 2f, 18.0754f, 3.46447f, 19.5403f)
        curveTo(4.70529f, 20.7815f, 6.58688f, 20.9711f, 10f, 21f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(13f, 18.6667f)
        curveTo(13f, 19.9553f, 14.0074f, 21f, 15.25f, 21f)
        horizontalLineTo(19.975f)
        curveTo(21.0934f, 21f, 22f, 20.0598f, 22f, 18.9f)
        curveTo(22f, 17.7402f, 21.0833f, 16.8f, 19.9649f, 16.8f)
        curveTo(20.0897f, 15.3643f, 18.9799f, 14f, 17.5f, 14f)
        curveTo(16.2055f, 14f, 15.1431f, 15.0307f, 15.0342f, 16.3439f)
        curveTo(13.8928f, 16.4566f, 13f, 17.4535f, 13f, 18.6667f)
        }
        }.build()

        return _folderCloud!!
    }

private var _folderCloud: ImageVector? = null
