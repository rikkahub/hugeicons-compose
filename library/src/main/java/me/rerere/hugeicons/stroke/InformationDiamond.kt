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

val HugeIcons.InformationDiamond: ImageVector
    get() {
        if (_informationDiamond != null) {
            return _informationDiamond!!
        }
        _informationDiamond = ImageVector.Builder(
            name = "InformationDiamond",
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
            moveTo(5.92089f, 5.92089f)
            curveTo(8.15836f, 3.68342f, 9.2771f, 2.56468f, 10.5857f, 2.19562f)
            curveTo(11.5105f, 1.93479f, 12.4895f, 1.93479f, 13.4143f, 2.19562f)
            curveTo(14.7229f, 2.56468f, 15.8416f, 3.68342f, 18.0791f, 5.92089f)
            curveTo(20.3166f, 8.15836f, 21.4353f, 9.2771f, 21.8044f, 10.5857f)
            curveTo(22.0652f, 11.5105f, 22.0652f, 12.4895f, 21.8044f, 13.4143f)
            curveTo(21.4353f, 14.7229f, 20.3166f, 15.8416f, 18.0791f, 18.0791f)
            curveTo(15.8416f, 20.3166f, 14.7229f, 21.4353f, 13.4143f, 21.8044f)
            curveTo(12.4895f, 22.0652f, 11.5105f, 22.0652f, 10.5857f, 21.8044f)
            curveTo(9.2771f, 21.4353f, 8.15836f, 20.3166f, 5.92089f, 18.0791f)
            curveTo(3.68342f, 15.8416f, 2.56468f, 14.7229f, 2.19562f, 13.4143f)
            curveTo(1.93479f, 12.4895f, 1.93479f, 11.5105f, 2.19562f, 10.5857f)
            curveTo(2.56468f, 9.2771f, 3.68342f, 8.15836f, 5.92089f, 5.92089f)
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
            moveTo(12f, 16f)
            verticalLineTo(12f)
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
            moveTo(12.125f, 8.25f)
            horizontalLineTo(12f)
            moveTo(12.25f, 8.25f)
            curveTo(12.25f, 8.11193f, 12.1381f, 8f, 12f, 8f)
            curveTo(11.8619f, 8f, 11.75f, 8.11193f, 11.75f, 8.25f)
            curveTo(11.75f, 8.38807f, 11.8619f, 8.5f, 12f, 8.5f)
            curveTo(12.1381f, 8.5f, 12.25f, 8.38807f, 12.25f, 8.25f)
            close()
        }
        }.build()

        return _informationDiamond!!
    }

private var _informationDiamond: ImageVector? = null
