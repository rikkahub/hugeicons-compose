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

val HugeIcons.FileVideoCamera: ImageVector
    get() {
        if (_fileVideoCamera != null) {
            return _fileVideoCamera!!
        }
        _fileVideoCamera = ImageVector.Builder(
            name = "FileVideoCamera",
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
            moveTo(7f, 16f)
            horizontalLineTo(6.5f)
            curveTo(5.56812f, 16f, 5.10218f, 16f, 4.73463f, 16.1522f)
            curveTo(4.24458f, 16.3552f, 3.85523f, 16.7446f, 3.65224f, 17.2346f)
            curveTo(3.5f, 17.6022f, 3.5f, 18.0681f, 3.5f, 19f)
            curveTo(3.5f, 19.9319f, 3.5f, 20.3978f, 3.65224f, 20.7654f)
            curveTo(3.85523f, 21.2554f, 4.24458f, 21.6448f, 4.73463f, 21.8478f)
            curveTo(5.10218f, 22f, 5.56812f, 22f, 6.5f, 22f)
            horizontalLineTo(7f)
            curveTo(7.93188f, 22f, 8.39782f, 22f, 8.76537f, 21.8478f)
            curveTo(9.25542f, 21.6448f, 9.64477f, 21.2554f, 9.84776f, 20.7654f)
            curveTo(10f, 20.3978f, 10f, 19.9319f, 10f, 19f)
            curveTo(10f, 18.0681f, 10f, 17.6022f, 9.84776f, 17.2346f)
            curveTo(9.64477f, 16.7446f, 9.25542f, 16.3552f, 8.76537f, 16.1522f)
            curveTo(8.39782f, 16f, 7.93188f, 16f, 7f, 16f)
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
            moveTo(10f, 18.0455f)
            lineTo(12.0039f, 16.9526f)
            curveTo(12.6692f, 16.5897f, 13.0019f, 16.4082f, 13.251f, 16.5462f)
            curveTo(13.5f, 16.6841f, 13.5f, 17.0498f, 13.5f, 17.7813f)
            verticalLineTo(20.2187f)
            curveTo(13.5f, 20.9502f, 13.5f, 21.3159f, 13.251f, 21.4538f)
            curveTo(13.0019f, 21.5918f, 12.6692f, 21.4103f, 12.0039f, 21.0474f)
            lineTo(10f, 19.9545f)
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
            moveTo(4.5f, 12f)
            verticalLineTo(9.45584f)
            curveTo(4.5f, 6.21082f, 4.5f, 4.58831f, 5.38607f, 3.48933f)
            curveTo(5.56508f, 3.26731f, 5.76731f, 3.06508f, 5.98933f, 2.88607f)
            curveTo(7.08831f, 2f, 8.71082f, 2f, 11.9558f, 2f)
            curveTo(12.6614f, 2f, 13.0141f, 2f, 13.3372f, 2.11401f)
            curveTo(13.4044f, 2.13772f, 13.4702f, 2.165f, 13.5345f, 2.19575f)
            curveTo(13.8436f, 2.34355f, 14.093f, 2.593f, 14.5919f, 3.09188f)
            lineTo(19.3284f, 7.82843f)
            curveTo(19.9065f, 8.40649f, 20.1955f, 8.69552f, 20.3478f, 9.06306f)
            curveTo(20.5f, 9.4306f, 20.5f, 9.83935f, 20.5f, 10.6569f)
            verticalLineTo(14.252f)
            curveTo(20.5f, 18.0232f, 20.5f, 19.9089f, 19.3284f, 21.0804f)
            curveTo(18.8588f, 21.55f, 18.2745f, 21.8314f, 17.5f, 22f)
            moveTo(13.5f, 2.5f)
            verticalLineTo(3f)
            curveTo(13.5f, 5.82843f, 13.5f, 7.24264f, 14.3787f, 8.12132f)
            curveTo(15.2574f, 9f, 16.6716f, 9f, 19.5f, 9f)
            horizontalLineTo(20f)
        }
        }.build()

        return _fileVideoCamera!!
    }

private var _fileVideoCamera: ImageVector? = null
