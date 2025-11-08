package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.FileSecurity: ImageVector
    get() {
        if (_fileSecurity != null) {
            return _fileSecurity!!
        }
        _fileSecurity = ImageVector.Builder(
            name = "FileSecurity",
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
        moveTo(20f, 11.999f)
        verticalLineTo(10.6559f)
        curveTo(20f, 9.83838f, 20f, 9.42963f, 19.8478f, 9.06208f)
        curveTo(19.6955f, 8.69454f, 19.4065f, 8.40551f, 18.8284f, 7.82745f)
        lineTo(14.0919f, 3.09091f)
        curveTo(13.593f, 2.59202f, 13.3436f, 2.34258f, 13.0345f, 2.19477f)
        curveTo(12.9702f, 2.16403f, 12.9044f, 2.13674f, 12.8372f, 2.11303f)
        curveTo(12.5141f, 1.99902f, 12.1614f, 1.99902f, 11.4558f, 1.99902f)
        curveTo(8.21082f, 1.99902f, 6.58831f, 1.99902f, 5.48933f, 2.8851f)
        curveTo(5.26731f, 3.0641f, 5.06508f, 3.26634f, 4.88607f, 3.48835f)
        curveTo(4f, 4.58733f, 4f, 6.20984f, 4f, 9.45487f)
        verticalLineTo(13.999f)
        curveTo(4f, 17.7703f, 4f, 19.6559f, 5.17157f, 20.8274f)
        curveTo(6.34315f, 21.999f, 8.22876f, 21.999f, 12f, 21.999f)
        moveTo(13f, 2.49902f)
        verticalLineTo(2.99902f)
        curveTo(13f, 5.82745f, 13f, 7.24166f, 13.8787f, 8.12034f)
        curveTo(14.7574f, 8.99902f, 16.1716f, 8.99902f, 19f, 8.99902f)
        horizontalLineTo(19.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(20f, 17.6214f)
        verticalLineTo(15.6503f)
        curveTo(20f, 15.3403f, 19.7723f, 15.083f, 19.477f, 15.0302f)
        curveTo(18.2869f, 14.8174f, 17.299f, 14.3441f, 16.817f, 14.0816f)
        curveTo(16.6197f, 13.9741f, 16.3803f, 13.9741f, 16.183f, 14.0816f)
        curveTo(15.701f, 14.3441f, 14.7131f, 14.8174f, 13.523f, 15.0302f)
        curveTo(13.2277f, 15.083f, 13f, 15.3403f, 13f, 15.6503f)
        verticalLineTo(17.6214f)
        curveTo(13f, 20.1928f, 15.5424f, 21.5953f, 16.2935f, 21.9536f)
        curveTo(16.426f, 22.0168f, 16.574f, 22.0168f, 16.7065f, 21.9536f)
        curveTo(17.4576f, 21.5953f, 20f, 20.1928f, 20f, 17.6214f)
        }
        }.build()

        return _fileSecurity!!
    }

private var _fileSecurity: ImageVector? = null
