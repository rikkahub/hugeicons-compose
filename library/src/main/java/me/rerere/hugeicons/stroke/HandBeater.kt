package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.HandBeater: ImageVector
    get() {
        if (_handBeater != null) {
            return _handBeater!!
        }
        _handBeater = ImageVector.Builder(
            name = "HandBeater",
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
        moveTo(6.41699f, 21.8262f)
        lineTo(2.1739f, 17.5853f)
        curveTo(1.91158f, 17.3231f, 1.94759f, 16.8882f, 2.24947f, 16.6727f)
        curveTo(3.68235f, 15.6497f, 5.64516f, 15.8121f, 6.89028f, 17.0566f)
        lineTo(6.94596f, 17.1122f)
        curveTo(8.19108f, 18.3567f, 8.35352f, 20.3185f, 7.33004f, 21.7507f)
        curveTo(7.11441f, 22.0524f, 6.67931f, 22.0884f, 6.41699f, 21.8262f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(7f, 17.002f)
        lineTo(11.002f, 13.002f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(14.498f, 9.50198f)
        horizontalLineTo(14.507f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(13.8631f, 5.67983f)
        curveTo(17.2916f, 3.92938f, 17.1251f, 2.68028f, 18.0622f, 2.01555f)
        curveTo(18.3557f, 1.88862f, 19.2716f, 2.46754f, 20.1767f, 3.28985f)
        curveTo(21.2027f, 4.22211f, 22.17f, 5.50263f, 21.9779f, 5.99628f)
        curveTo(21.3543f, 6.69231f, 20.0862f, 6.98319f, 18.7047f, 9.52817f)
        curveTo(16.9362f, 12.4935f, 14.4751f, 13.3921f, 13.0604f, 13.9085f)
        lineTo(13.0243f, 13.9217f)
        curveTo(12.7108f, 14.0362f, 12.3553f, 14.003f, 12.0997f, 13.7883f)
        curveTo(11.6727f, 13.4295f, 11.344f, 13.0471f, 11.052f, 12.7635f)
        curveTo(9.99414f, 11.8001f, 9.99414f, 11.5296f, 9.99414f, 11.2752f)
        curveTo(10.0554f, 10.2461f, 12.1171f, 6.74924f, 13.8631f, 5.67983f)
        }
        }.build()

        return _handBeater!!
    }

private var _handBeater: ImageVector? = null
