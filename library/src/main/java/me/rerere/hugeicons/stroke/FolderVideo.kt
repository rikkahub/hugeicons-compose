package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.FolderVideo: ImageVector
    get() {
        if (_folderVideo != null) {
            return _folderVideo!!
        }
        _folderVideo = ImageVector.Builder(
            name = "FolderVideo",
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
        moveTo(19f, 18.5f)
        lineTo(20.4453f, 19.4635f)
        curveTo(21.1297f, 19.9198f, 21.4719f, 20.1479f, 21.7359f, 20.0066f)
        curveTo(22f, 19.8653f, 22f, 19.454f, 22f, 18.6315f)
        verticalLineTo(17.3685f)
        curveTo(22f, 16.546f, 22f, 16.1347f, 21.7359f, 15.9934f)
        curveTo(21.4719f, 15.8521f, 21.1297f, 16.0802f, 20.4453f, 16.5365f)
        lineTo(19f, 17.5f)
        moveTo(19f, 18.5f)
        verticalLineTo(17.5f)
        moveTo(19f, 18.5f)
        curveTo(19f, 19.4346f, 19f, 19.9019f, 18.799f, 20.25f)
        curveTo(18.6674f, 20.478f, 18.478f, 20.6674f, 18.25f, 20.799f)
        curveTo(17.9019f, 21f, 17.4346f, 21f, 16.5f, 21f)
        horizontalLineTo(16f)
        curveTo(14.5858f, 21f, 13.8787f, 21f, 13.4393f, 20.5607f)
        curveTo(13f, 20.1213f, 13f, 19.4142f, 13f, 18f)
        curveTo(13f, 16.5858f, 13f, 15.8787f, 13.4393f, 15.4393f)
        curveTo(13.8787f, 15f, 14.5858f, 15f, 16f, 15f)
        horizontalLineTo(16.5f)
        curveTo(17.4346f, 15f, 17.9019f, 15f, 18.25f, 15.201f)
        curveTo(18.478f, 15.3326f, 18.6674f, 15.522f, 18.799f, 15.75f)
        curveTo(19f, 16.0981f, 19f, 16.5654f, 19f, 17.5f)
        }
        }.build()

        return _folderVideo!!
    }

private var _folderVideo: ImageVector? = null
