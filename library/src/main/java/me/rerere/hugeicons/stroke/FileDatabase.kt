package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.FileDatabase: ImageVector
    get() {
        if (_fileDatabase != null) {
            return _fileDatabase!!
        }
        _fileDatabase = ImageVector.Builder(
            name = "FileDatabase",
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
        moveTo(21f, 14.5f)
        verticalLineTo(20.5f)
        curveTo(21f, 21.3284f, 19.2091f, 22f, 17f, 22f)
        curveTo(14.7909f, 22f, 13f, 21.3284f, 13f, 20.5f)
        verticalLineTo(14.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12f, 2.5f)
        verticalLineTo(3f)
        curveTo(12f, 5.82843f, 12f, 7.24264f, 12.8787f, 8.12132f)
        curveTo(13.7574f, 9f, 15.1716f, 9f, 18f, 9f)
        horizontalLineTo(18.5f)
        moveTo(19f, 10.5f)
        curveTo(18.9993f, 9.7855f, 18.9899f, 9.40631f, 18.8478f, 9.06306f)
        curveTo(18.6955f, 8.69552f, 18.4065f, 8.40649f, 17.8284f, 7.82843f)
        lineTo(13.0919f, 3.09188f)
        curveTo(12.593f, 2.593f, 12.3436f, 2.34355f, 12.0345f, 2.19575f)
        curveTo(11.9702f, 2.165f, 11.9044f, 2.13772f, 11.8372f, 2.11401f)
        curveTo(11.5141f, 2f, 11.1614f, 2f, 10.4558f, 2f)
        curveTo(7.21082f, 2f, 5.58831f, 2f, 4.48933f, 2.88607f)
        curveTo(4.26731f, 3.06508f, 4.06508f, 3.26731f, 3.88607f, 3.48933f)
        curveTo(3f, 4.58831f, 3f, 6.21082f, 3f, 9.45584f)
        verticalLineTo(14f)
        curveTo(3f, 17.7712f, 3f, 19.6569f, 4.17157f, 20.8284f)
        curveTo(5.23467f, 21.8915f, 6.8857f, 21.99f, 10f, 21.9991f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(17f, 16f)
        curveTo(19.2091f, 16f, 21f, 15.3284f, 21f, 14.5f)
        curveTo(21f, 13.6716f, 19.2091f, 13f, 17f, 13f)
        curveTo(14.7909f, 13f, 13f, 13.6716f, 13f, 14.5f)
        curveTo(13f, 15.3284f, 14.7909f, 16f, 17f, 16f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(21f, 17.5f)
        curveTo(21f, 18.3284f, 19.2091f, 19f, 17f, 19f)
        curveTo(14.7909f, 19f, 13f, 18.3284f, 13f, 17.5f)
        }
        }.build()

        return _fileDatabase!!
    }

private var _fileDatabase: ImageVector? = null
