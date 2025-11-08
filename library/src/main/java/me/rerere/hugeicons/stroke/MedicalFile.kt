package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.MedicalFile: ImageVector
    get() {
        if (_medicalFile != null) {
            return _medicalFile!!
        }
        _medicalFile = ImageVector.Builder(
            name = "MedicalFile",
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
        moveTo(19f, 9f)
        verticalLineTo(7.81818f)
        curveTo(19f, 6.12494f, 19f, 5.27832f, 18.7478f, 4.60214f)
        curveTo(18.3424f, 3.5151f, 17.4849f, 2.65765f, 16.3979f, 2.2522f)
        curveTo(15.7217f, 2f, 14.8751f, 2f, 13.1818f, 2f)
        curveTo(10.2186f, 2f, 8.73706f, 2f, 7.55375f, 2.44135f)
        curveTo(5.65142f, 3.15088f, 4.15088f, 4.65142f, 3.44135f, 6.55375f)
        curveTo(3f, 7.73706f, 3f, 9.21865f, 3f, 12.1818f)
        lineTo(3f, 14.7273f)
        curveTo(3f, 17.7966f, 3f, 19.3313f, 3.79783f, 20.3971f)
        curveTo(4.02643f, 20.7025f, 4.29752f, 20.9736f, 4.60289f, 21.2022f)
        curveTo(5.66867f, 22f, 7.20336f, 22f, 10.2727f, 22f)
        horizontalLineTo(11f)
        curveTo(12.1698f, 22f, 14.5f, 22f, 14.5f, 22f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(11f, 14.3333f)
        horizontalLineTo(11.8403f)
        curveTo(12.5019f, 14.3333f, 12.8326f, 14.3333f, 13.0985f, 14.5076f)
        curveTo(13.3643f, 14.6818f, 13.5122f, 14.9956f, 13.8081f, 15.6232f)
        lineTo(15.4f, 19f)
        lineTo(17.6f, 12f)
        lineTo(19.1919f, 15.3768f)
        curveTo(19.4878f, 16.0044f, 19.6357f, 16.3182f, 19.9015f, 16.4924f)
        curveTo(20.1674f, 16.6667f, 20.4981f, 16.6667f, 21.1597f, 16.6667f)
        horizontalLineTo(22f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(3f, 12f)
        curveTo(3f, 10.1591f, 4.49238f, 8.66667f, 6.33333f, 8.66667f)
        horizontalLineTo(7.44444f)
        curveTo(7.9611f, 8.66667f, 8.21942f, 8.66667f, 8.43137f, 8.60988f)
        curveTo(9.00652f, 8.45577f, 9.45576f, 8.00652f, 9.60988f, 7.43137f)
        curveTo(9.66667f, 7.21942f, 9.66667f, 6.9611f, 9.66667f, 6.44444f)
        verticalLineTo(5.33333f)
        curveTo(9.66667f, 3.49238f, 11.1591f, 2f, 13f, 2f)
        }
        }.build()

        return _medicalFile!!
    }

private var _medicalFile: ImageVector? = null
