package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Navigation05: ImageVector
    get() {
        if (_navigation05 != null) {
            return _navigation05!!
        }
        _navigation05 = ImageVector.Builder(
            name = "Navigation05",
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
        moveTo(22f, 12f)
        curveTo(22f, 17.5228f, 17.5228f, 22f, 12f, 22f)
        curveTo(6.47715f, 22f, 2f, 17.5228f, 2f, 12f)
        curveTo(2f, 6.47715f, 6.47715f, 2f, 12f, 2f)
        curveTo(17.5228f, 2f, 22f, 6.47715f, 22f, 12f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(13.6929f, 7.47664f)
        lineTo(10.9605f, 8.60175f)
        curveTo(10.1362f, 8.94115f, 9.72411f, 9.11084f, 9.41748f, 9.41748f)
        curveTo(9.11084f, 9.72411f, 8.94115f, 10.1362f, 8.60175f, 10.9605f)
        lineTo(7.47664f, 13.6929f)
        curveTo(6.63274f, 15.7424f, 6.21079f, 16.7671f, 6.72185f, 17.2782f)
        curveTo(7.2329f, 17.7892f, 8.25764f, 17.3673f, 10.3071f, 16.5234f)
        lineTo(13.0395f, 15.3982f)
        curveTo(13.8638f, 15.0589f, 14.2759f, 14.8892f, 14.5825f, 14.5825f)
        curveTo(14.8892f, 14.2759f, 15.0589f, 13.8638f, 15.3982f, 13.0395f)
        lineTo(16.5234f, 10.3071f)
        curveTo(17.3673f, 8.25764f, 17.7892f, 7.2329f, 17.2782f, 6.72185f)
        curveTo(16.7671f, 6.21079f, 15.7424f, 6.63274f, 13.6929f, 7.47664f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12f, 12f)
        verticalLineTo(12.01f)
        }
        }.build()

        return _navigation05!!
    }

private var _navigation05: ImageVector? = null
