package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.FileValidation: ImageVector
    get() {
        if (_fileValidation != null) {
            return _fileValidation!!
        }
        _fileValidation = ImageVector.Builder(
            name = "FileValidation",
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
        moveTo(9.72727f, 2f)
        curveTo(6.46607f, 2f, 4.83546f, 2f, 3.70307f, 2.79784f)
        curveTo(3.37862f, 3.02643f, 3.09058f, 3.29752f, 2.8477f, 3.60289f)
        curveTo(2f, 4.66867f, 2f, 6.20336f, 2f, 9.27273f)
        verticalLineTo(11.8182f)
        curveTo(2f, 14.7814f, 2f, 16.2629f, 2.46894f, 17.4462f)
        curveTo(3.22281f, 19.3486f, 4.81714f, 20.8491f, 6.83836f, 21.5586f)
        curveTo(8.09563f, 22f, 9.66981f, 22f, 12.8182f, 22f)
        curveTo(14.6173f, 22f, 15.5168f, 22f, 16.2352f, 21.7478f)
        curveTo(17.3902f, 21.3424f, 18.3012f, 20.4849f, 18.732f, 19.3979f)
        curveTo(19f, 18.7217f, 19f, 17.8751f, 19f, 16.1818f)
        verticalLineTo(15.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(15f, 7.5f)
        curveTo(15f, 7.5f, 15.5f, 7.5f, 16f, 8.5f)
        curveTo(16f, 8.5f, 17.5882f, 6f, 19f, 5.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(22f, 7f)
        curveTo(22f, 9.76142f, 19.7614f, 12f, 17f, 12f)
        curveTo(14.2386f, 12f, 12f, 9.76142f, 12f, 7f)
        curveTo(12f, 4.23858f, 14.2386f, 2f, 17f, 2f)
        curveTo(19.7614f, 2f, 22f, 4.23858f, 22f, 7f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(2f, 12f)
        curveTo(2f, 13.8409f, 3.49238f, 15.3333f, 5.33333f, 15.3333f)
        curveTo(5.99912f, 15.3333f, 6.78404f, 15.2167f, 7.43137f, 15.3901f)
        curveTo(8.00652f, 15.5442f, 8.45576f, 15.9935f, 8.60988f, 16.5686f)
        curveTo(8.78333f, 17.216f, 8.66667f, 18.0009f, 8.66667f, 18.6667f)
        curveTo(8.66667f, 20.5076f, 10.1591f, 22f, 12f, 22f)
        }
        }.build()

        return _fileValidation!!
    }

private var _fileValidation: ImageVector? = null
