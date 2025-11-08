package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.FileShredder: ImageVector
    get() {
        if (_fileShredder != null) {
            return _fileShredder!!
        }
        _fileShredder = ImageVector.Builder(
            name = "FileShredder",
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
        moveTo(22f, 12.999f)
        horizontalLineTo(2f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(20f, 13.001f)
        verticalLineTo(10.6578f)
        curveTo(20f, 9.84033f, 20f, 9.43158f, 19.8478f, 9.06404f)
        curveTo(19.6955f, 8.69649f, 19.4065f, 8.40746f, 18.8284f, 7.8294f)
        lineTo(14.0919f, 3.09286f)
        curveTo(13.593f, 2.59397f, 13.3436f, 2.34453f, 13.0345f, 2.19672f)
        curveTo(12.9702f, 2.16598f, 12.9044f, 2.1387f, 12.8372f, 2.11499f)
        curveTo(12.5141f, 2.00098f, 12.1614f, 2.00098f, 11.4558f, 2.00098f)
        curveTo(8.21082f, 2.00098f, 6.58831f, 2.00098f, 5.48933f, 2.88705f)
        curveTo(5.26731f, 3.06606f, 5.06508f, 3.26829f, 4.88607f, 3.49031f)
        curveTo(4f, 4.58928f, 4f, 6.2118f, 4f, 9.45682f)
        verticalLineTo(13.001f)
        moveTo(13f, 2.50098f)
        verticalLineTo(3.00098f)
        curveTo(13f, 5.8294f, 13f, 7.24362f, 13.8787f, 8.1223f)
        curveTo(14.7574f, 9.00098f, 16.1716f, 9.00098f, 19f, 9.00098f)
        horizontalLineTo(19.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(6f, 15.999f)
        verticalLineTo(16.999f)
        moveTo(10f, 15.999f)
        verticalLineTo(21.999f)
        moveTo(14f, 15.999f)
        verticalLineTo(17.999f)
        moveTo(18f, 15.999f)
        verticalLineTo(19.999f)
        }
        }.build()

        return _fileShredder!!
    }

private var _fileShredder: ImageVector? = null
