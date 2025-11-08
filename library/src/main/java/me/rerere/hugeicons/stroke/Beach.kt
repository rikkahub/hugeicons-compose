package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Beach: ImageVector
    get() {
        if (_beach != null) {
            return _beach!!
        }
        _beach = ImageVector.Builder(
            name = "Beach",
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
        moveTo(2f, 15.7501f)
        curveTo(2f, 15.7501f, 3.79534f, 15f, 7f, 15f)
        curveTo(12f, 15f, 16f, 18f, 22f, 18f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(2f, 21f)
        horizontalLineTo(22f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12.594f, 3.22761f)
        curveTo(9.74838f, 4.04368f, 7.89871f, 6.85224f, 8.0043f, 9.87504f)
        curveTo(8.02623f, 10.5029f, 8.03719f, 10.8168f, 8.30546f, 10.9556f)
        curveTo(8.57373f, 11.0944f, 8.85218f, 10.8977f, 9.40908f, 10.5041f)
        lineTo(10.6506f, 9.6268f)
        curveTo(10.8371f, 9.49503f, 11.0585f, 9.43155f, 11.2815f, 9.44587f)
        lineTo(14.1977f, 9.63321f)
        lineTo(16.6357f, 7.91042f)
        curveTo(16.8222f, 7.77865f, 17.0435f, 7.71517f, 17.2666f, 7.7295f)
        lineTo(18.7879f, 7.82723f)
        curveTo(19.4407f, 7.86916f, 19.7671f, 7.89013f, 19.9291f, 7.63883f)
        curveTo(20.0912f, 7.38753f, 19.9594f, 7.11583f, 19.6959f, 6.57242f)
        curveTo(18.3856f, 3.86989f, 15.4553f, 2.40707f, 12.594f, 3.22761f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(14.5f, 9.5f)
        lineTo(16.5f, 17f)
        moveTo(12.2857f, 3f)
        lineTo(12f, 2f)
        }
        }.build()

        return _beach!!
    }

private var _beach: ImageVector? = null
